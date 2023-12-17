package com.practica.munoz_daniel_practicapmdm.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.practica.munoz_daniel_practicapmdm.model.Postre
import com.practica.munoz_daniel_practicapmdm.R
class ItemAdapter(private val dataset: List<Postre>): RecyclerView.Adapter<ItemAdapter.ViewHolder>()
{

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val imageView: ImageView = itemView.findViewById(R.id.image_dulce)
        val textView: TextView = itemView.findViewById(R.id.txt_dulcenombre)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
      return ViewHolder(
          LayoutInflater.from(parent.context).inflate(
              R.layout.list_dulces,
              parent,
              false
          )
      )
    }

    override fun getItemCount(): Int {
      return dataset.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val postre = dataset[position]

        holder.itemView.apply {
            holder.imageView.setImageResource(postre.resourceImage)
            holder.textView.text = context.resources.getString(postre.resourceIdNombre)
        }
    }
}