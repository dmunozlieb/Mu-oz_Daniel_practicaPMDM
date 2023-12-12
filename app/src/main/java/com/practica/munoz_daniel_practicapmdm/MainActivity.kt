package com.practica.munoz_daniel_practicapmdm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.practica.munoz_daniel_practicapmdm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        cargarGif()
    }
    fun cargarGif(){
        Glide.with(this)
            .load(R.drawable.happy_bear)
            .into(binding.gifHappybear)
    }
}