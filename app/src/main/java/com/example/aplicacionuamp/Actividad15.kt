package com.example.aplicacionuamp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Actividad15 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad15)
    }
    fun actividad14(view: View){
        val intent = Intent(this, Actividad14()::class.java)
        startActivity(intent)
    }
}