package com.example.aplicacionuamp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Actividad19 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad19)
    }
    fun actividad8(view: View){
        val intent = Intent(this, Actividad8()::class.java)
        startActivity(intent)
    }
    fun actividad20(view: View){
        val intent = Intent(this, Actividad20()::class.java)
        startActivity(intent)
    }
    fun actividad21(view: View){
        val intent = Intent(this, Actividad21()::class.java)
        startActivity(intent)
    }
    fun actividad22(view: View){
        val intent = Intent(this, Actividad22()::class.java)
        startActivity(intent)
    }
    fun actividad23(view: View){
        val intent = Intent(this, Actividad23()::class.java)
        startActivity(intent)
    }
}