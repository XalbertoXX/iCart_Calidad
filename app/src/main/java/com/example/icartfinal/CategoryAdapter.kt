package com.example.icartfinal

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CategoryAdapter(
    val categorias: Array<Category>,
    val listener: CategoriesActivity,

    ): RecyclerView.Adapter<CategoryAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView), View.OnClickListener{
        var itemTitle = itemView.findViewById<TextView>(R.id.tvCategoria)

        init {
            itemView.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            val position:Int = adapterPosition
            if(position != RecyclerView.NO_POSITION) {
                    listener.onRecyclerClick(position)
            }
        }

        fun bindCategory(categoria: Category){
            itemTitle.text = categoria.nombreCategoria
        }


    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val infl = LayoutInflater.from(parent.context).inflate(R.layout.category_layout, parent, false)
        return ViewHolder(infl)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val cat = categorias[position]
            holder.bindCategory(cat)
        }

    override fun getItemCount(): Int {
        return categorias.size
    }

}

public interface OnItemClickListener {
    fun onRecyclerClick(position: Int)
}