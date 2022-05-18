package com.example.icartfinal

import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Vibrator
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ProductsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)
        val data = intent.extras
        val posicion = data!!.getInt("posicion")
        val tvTitulo = findViewById<TextView>(R.id.tvNombreCategoria)
        tvTitulo.text = ShoppingList.listadoCategorias[posicion].nombreCategoria

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerViewProductos)
        val adaptador = ProductAdapter(ShoppingList.listadoCategorias[posicion].productos, this)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerView.adapter = adaptador
        recyclerView.setHasFixedSize(true)

        val btnVerLista = findViewById<Button>(R.id.btnVerLista)
        btnVerLista.setOnClickListener {
            val intent = Intent(this, ShoppingListActivity::class.java)
            startActivity(intent)
        }
        val numProduct = findViewById<TextView>(R.id.numProducts2)
        numProduct.text = ShoppingList.listaCompra.size.toString()
    }

    fun onRecyclerClick(position: Int, listaProductos: Array<Product>) {
        val isNotInList = ShoppingList.addToList(listaProductos[position].nombre)
        val alertDialogBuilder = AlertDialog.Builder(this)
        alertDialogBuilder.setTitle("¿Desea añadirlo?")
        alertDialogBuilder.setPositiveButton(android.R.string.ok) { dialog, which ->
            if (isNotInList) {
                Toast.makeText(applicationContext, "Producto Añadido", Toast.LENGTH_SHORT).show()
                ShoppingList.addToList(listaProductos[position].nombre)
                val vibratorService = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
                vibratorService.vibrate(200)
                val numProduct = findViewById<TextView>(R.id.numProducts2)
                numProduct.text = ShoppingList.listaCompra.size.toString()
            }
            else{
                Toast.makeText(this, "Ya esta en la lista", Toast.LENGTH_LONG).show()
            }
        }
        alertDialogBuilder.setNegativeButton(android.R.string.cancel){ dialog, which ->
        }
        alertDialogBuilder.show()
    }

    override fun onResume() {
        super.onResume()
        val numProduct = findViewById<TextView>(R.id.numProducts2)
        numProduct.text = ShoppingList.listaCompra.size.toString()
    }
}