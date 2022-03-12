package com.example.aplicacionuamp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Actividad8 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad8)
    }
    fun actividad3(view: View){
        val intent = Intent(this, Actividad3()::class.java)
        startActivity(intent)
    }

    fun actividad9(view: View){
        val intent = Intent(this, Actividad9()::class.java)
        startActivity(intent)
    }

    fun actividad14(view: View){
        val intent = Intent(this, Actividad14()::class.java)
        startActivity(intent)
    }
    fun actividad19(view: View){
        val intent = Intent(this, Actividad19()::class.java)
        startActivity(intent)
    }
    fun actividad24(view: View){
        val intent = Intent(this, Actividad24()::class.java)
        startActivity(intent)
    }
    fun actividad29(view: View){
        val intent = Intent(this, Actividad29()::class.java)
        startActivity(intent)
    }
    fun actividad34(view: View){
        val intent = Intent(this, Actividad34()::class.java)
        startActivity(intent)
    }
}