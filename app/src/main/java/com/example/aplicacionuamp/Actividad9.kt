package com.example.aplicacionuamp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Actividad9 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad9)
    }


    fun actividad10(view: View){
        val intent = Intent(this, Actividad10()::class.java)
        startActivity(intent)
    }

    fun actividad11(view: View){
        val intent = Intent(this, Actividad11()::class.java)
        startActivity(intent)
    }
    fun actividad12(view: View){
        val intent = Intent(this, Actividad12()::class.java)
        startActivity(intent)
    }
    fun actividad13(view: View){
        val intent = Intent(this, Actividad13()::class.java)
        startActivity(intent)
    }

    fun actividad8(view: View){
        val intent = Intent(this, Actividad8()::class.java)
        startActivity(intent)
    }
}