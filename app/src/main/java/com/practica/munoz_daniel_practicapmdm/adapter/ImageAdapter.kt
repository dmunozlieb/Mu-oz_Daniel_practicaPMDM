package com.practica.munoz_daniel_practicapmdm.adapter

import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.practica.munoz_daniel_practicapmdm.R
class ImageAdapter(private val listImage: List<Int>): RecyclerView.Adapter<ImageAdapter.ImageViewHolder>() {

    private var currentPosition = 0
    private val handler = Handler(Looper.getMainLooper())
    private lateinit var runnable: Runnable
    class ImageViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val imageView: ImageView = itemView.findViewById(R.id.list_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        return ImageViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(
                    R.layout.list_image,
                    parent,
                    false
                )
        )
    }

    override fun getItemCount(): Int {
        return listImage.size
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        val image = listImage[position]
        holder.itemView.apply {
            holder.imageView.setImageResource(image)
        }

    }

    fun startAutoScroll(recyclerView: RecyclerView) {
        runnable = Runnable {
            if (currentPosition == itemCount - 1) {
                currentPosition = 0
            } else {
                currentPosition++
            }
            recyclerView.smoothScrollToPosition(currentPosition)
            handler.postDelayed(runnable, AUTO_SCROLL_INTERVAL)
        }
        handler.postDelayed(runnable, AUTO_SCROLL_INTERVAL)
    }
    fun stopAutoScroll() {
        handler.removeCallbacks(runnable)
    }

    companion object{
        private val AUTO_SCROLL_INTERVAL = 2000L

    }
}