package com.practica.munoz_daniel_practicapmdm


import android.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import com.practica.munoz_daniel_practicapmdm.databinding.ActivityCalendarBinding
import java.time.LocalDate

class ActivityCalendar : AppCompatActivity() {
    private lateinit var binding: ActivityCalendarBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCalendarBinding.inflate(layoutInflater)
        setContentView(binding.root)
        asignarDia()

        binding.btnDia1.setOnClickListener{
            showDialogDia1()
        }

    }

    private fun asignarDia(){
        val fechaactual = LocalDate.now()
        var dia = fechaactual.dayOfMonth
        if (dia>25){
            dia = 25
            val textoFormat: String = getString(R.string.txt_diaactual, dia.toString())
            binding.txtDia.text = textoFormat
            return
        }
        val textoFormat: String = getString(R.string.txt_diaactual, dia.toString())
        binding.txtDia.text = textoFormat
    }

    private fun showDialogDia1(){

        val inflater = LayoutInflater.from(this)
        val dialogView = inflater.inflate(R.layout.dialog_layout1, null)
        asociarNombreTxt(dialogView)
        val builder = AlertDialog.Builder(this)
        builder.setView(dialogView)

        val alertDialog = builder.create()
        alertDialog.show()
    }
    private fun asociarNombreTxt(dialogView: View){
        if(intent != null){
            val textView: TextView = dialogView.findViewById(R.id.txt_felicitacion)
            val nombre_user = intent.getStringExtra("name")
            if (nombre_user!=null){
                val textoFormat = getString(R.string.happy_christmas, nombre_user)
                textView.text = textoFormat
            }
        }

    }

}