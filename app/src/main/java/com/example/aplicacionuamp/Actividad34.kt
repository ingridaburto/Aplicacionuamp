package com.example.aplicacionuamp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Actividad34 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad34)
    }
    fun actividad8(view: View){
        val intent = Intent(this, Actividad8()::class.java)
        startActivity(intent)
    }
    fun actividad35(view: View){
        val intent = Intent(this, Actividad35()::class.java)
        startActivity(intent)
    }
    fun actividad36(view: View){
        val intent = Intent(this, Actividad36()::class.java)
        startActivity(intent)
    }
    fun actividad37(view: View){
        val intent = Intent(this, Actividad37()::class.java)
        startActivity(intent)
    }
    fun actividad38(view: View){
        val intent = Intent(this, Actividad38()::class.java)
        startActivity(intent)
    }
}