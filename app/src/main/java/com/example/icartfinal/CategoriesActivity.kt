package com.example.icartfinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class CategoriesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_categories)

        val btnVerLista = findViewById<Button>(R.id.btnVerListaCat)
        val btnGoToFeedBack = findViewById<Button>(R.id.GoToFeedBack)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerViewCategorias)
        val adaptador = CategoryAdapter(ShoppingList.listadoCategorias, this)

        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerView.adapter = adaptador
        recyclerView.setHasFixedSize(true)

        btnVerLista.setOnClickListener {
            val intent = Intent(this, ShoppingListActivity::class.java)
            startActivity(intent)
        }
        btnGoToFeedBack.setOnClickListener {
            val intent = Intent(this, FeedBackActivity::class.java)
            startActivity(intent)
        }

        val numProduct = findViewById<TextView>(R.id.numProducts)
        numProduct.text = ShoppingList.listaCompra.size.toString()
    }

    override fun onResume() {
        super.onResume()
        val numProduct = findViewById<TextView>(R.id.numProducts)
        numProduct.text = ShoppingList.listaCompra.size.toString()
    }

    fun onRecyclerClick(position: Int) {
        val intent = Intent(this, ProductsActivity::class.java)
        intent.putExtra("posicion", position)
        startActivity(intent)
    }
}