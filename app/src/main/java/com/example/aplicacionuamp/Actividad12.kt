package com.example.aplicacionuamp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Actividad12 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad12)
    }
    fun actividad9(view: View){
        val intent = Intent(this, Actividad9()::class.java)
        startActivity(intent)
    }
}