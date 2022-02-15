package com.example.icartfinal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ShoppingListActivity : AppCompatActivity() {

    lateinit var adapter:ShoppingListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shopping_list)

        val btnBorrarTodo = findViewById<Button>(R.id.btnBorrarTodo)
        btnBorrarTodo.setOnClickListener {
            ShoppingList.listaCompra.clear()
            adapter.notifyDataSetChanged()
        }

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerViewShoppingList)
        adapter = ShoppingListAdapter(ShoppingList.listaCompra, this){index -> onClickDelete(index)}
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerView.adapter = adapter
        recyclerView.setHasFixedSize(true)

    }

    fun onRecyclerClick(position: Int) {
        // De momento no hace nada
    }
    fun onClickDelete(posicion: Int){
        ShoppingList.listaCompra.removeAt(posicion)
        adapter.setItems(ShoppingList.listaCompra)
    }
}