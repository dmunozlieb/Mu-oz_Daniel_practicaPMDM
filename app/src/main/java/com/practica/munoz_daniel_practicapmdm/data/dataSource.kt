package com.practica.munoz_daniel_practicapmdm.data

import com.practica.munoz_daniel_practicapmdm.model.Postre
import com.practica.munoz_daniel_practicapmdm.R
 class dataSource {
   companion object{
       fun loadPostres(): List<Postre>{
           return listOf(Postre(R.drawable.roscon_de_reyes,R.string.roscon_chritmas),
               Postre(R.drawable.tronco_de_navidad_,R.string.tronco_christmas),
               Postre(R.drawable.panettone, R.string.panettone_christmas),
               Postre(R.drawable.galletajengibre, R.string.galleta_jengibre),
               Postre(R.drawable.stollen, R.string.stollen),
               Postre(R.drawable.polvoron_almendra_entera, R.string.polvoron_almendras)
           )

       }
    }
}