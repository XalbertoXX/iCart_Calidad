package com.example.icartfinal

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ProductAdapter(
    val listadoProductos: Array<Product>,
    val listener: ProductsActivity,
): RecyclerView.Adapter<ProductAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView), View.OnClickListener{
        var itemTitle = itemView.findViewById<TextView>(R.id.tvProducto)

        init {
            itemView.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            val position:Int = adapterPosition
            if(position != RecyclerView.NO_POSITION) {
                listener.onRecyclerClick(position, listadoProductos)
            }
        }

        fun bindProduct(prod: Product){
            itemTitle.text = prod.nombre

        }


    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val infl = LayoutInflater.from(parent.context).inflate(R.layout.product_layout, parent, false)
        return ViewHolder(infl)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val prod = listadoProductos[position]
        holder.bindProduct(prod)
    }

    override fun getItemCount(): Int {
        return listadoProductos.size
    }

}

public interface OnItemClickListener2 {
    fun onRecyclerClick(position: Int)
}

