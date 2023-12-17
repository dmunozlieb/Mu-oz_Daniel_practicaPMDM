package com.practica.munoz_daniel_practicapmdm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.practica.munoz_daniel_practicapmdm.adapter.ImageAdapter
import com.practica.munoz_daniel_practicapmdm.adapter.ItemAdapter
import com.practica.munoz_daniel_practicapmdm.data.dataImages
import com.practica.munoz_daniel_practicapmdm.data.dataSource
import com.practica.munoz_daniel_practicapmdm.databinding.ActivityRecetaBinding

class ActivityReceta : AppCompatActivity() {
    private lateinit var binding: ActivityRecetaBinding
    private lateinit var postreAdapter: ItemAdapter
    private lateinit var imageAdapter: ImageAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecetaBinding.inflate(layoutInflater)
        setContentView(binding.root)
        configurarGif()
        postreAdapter= ItemAdapter(dataSource.loadPostres())
        imageAdapter = ImageAdapter(dataImages.loadImages())
        val rvPostreList: RecyclerView = findViewById(R.id.recycler_view)
        val rvImageView: RecyclerView = findViewById(R.id.rvImage)
        rvImageView.adapter = imageAdapter
        rvPostreList.adapter = postreAdapter
        rvPostreList.layoutManager = LinearLayoutManager(this)
        rvImageView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false)
        imageAdapter.startAutoScroll(rvImageView)
    }

    override fun onDestroy() {
        imageAdapter.stopAutoScroll()
        super.onDestroy()
    }
    private fun configurarGif(){
        Glide.with(this)
            .load(R.drawable.aro_navidad)
            .into(binding.iconAronavidad)
    }
}