package com.practica.munoz_daniel_practicapmdm.data

import android.widget.ImageView
import androidx.annotation.DrawableRes
import com.practica.munoz_daniel_practicapmdm.R
class dataImages {
    companion object{
        fun loadImages(): List<Int>{
            return listOf(R.drawable.roscon_de_reyes,
                R.drawable.tronco_de_navidad_,
                R.drawable.panettone,
                R.drawable.galletajengibre,
                R.drawable.stollen,
                R.drawable.polvoron_almendra_entera
            )
        }
    }

}