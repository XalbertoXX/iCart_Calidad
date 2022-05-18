package com.example.icartfinal

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.core.os.persistableBundleOf
import androidx.recyclerview.widget.RecyclerView

class ShoppingListAdapter(
    listaCompra:ArrayList<String>,
    val listener: ShoppingListActivity,
    val onClickDelete: (Int) -> Unit
): RecyclerView.Adapter<ShoppingListAdapter.ViewHolder>() {
    var lista = listaCompra

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView), View.OnClickListener{
        var itemTitle = itemView.findViewById<TextView>(R.id.tvShoppingList)
        val btnEliminar = itemView.findViewById<Button>(R.id.btnEliminar)

        init {
            itemView.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            val position:Int = adapterPosition
            if(position != RecyclerView.NO_POSITION) {
                listener.onRecyclerClick(position)
            }
        }

        fun bindName(nombre: String, position: Int){
            itemTitle.text = nombre
            btnEliminar.setOnClickListener { onClickDelete(position) }
        }

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val infl = LayoutInflater.from(parent.context).inflate(R.layout.shopping_list_layout, parent, false)
        return ViewHolder(infl)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val nombre = lista[position]
        holder.bindName(nombre, position)

    }

    override fun getItemCount(): Int {
        return lista.size
    }

    fun setItems(listaCompra: ArrayList<String>){
        lista = listaCompra
        notifyDataSetChanged()
    }
}