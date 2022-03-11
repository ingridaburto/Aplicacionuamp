package com.example.aplicacionuamp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Actividad3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad3)
    }
    fun actividad4(view: View){
        val intent = Intent(this, Actividad4()::class.java)
        startActivity(intent)
    }

    fun actividad5(view: View){
        val intent = Intent(this, Actividad5()::class.java)
        startActivity(intent)
    }

    fun actividad6(view:View){
        val intent = Intent(this, Actividad6()::class.java)
        startActivity(intent)
    }
    fun actividad7(view:View){
        val intent = Intent(this, Actividad7()::class.java)
        startActivity(intent)
    }
}