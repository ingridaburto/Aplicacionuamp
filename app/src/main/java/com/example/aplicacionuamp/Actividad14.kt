package com.example.aplicacionuamp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Actividad14 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad14)
    }
    fun actividad8(view: View){
        val intent = Intent(this, Actividad8()::class.java)
        startActivity(intent)
    }
    fun actividad15(view: View){
        val intent = Intent(this, Actividad15()::class.java)
        startActivity(intent)
    }
    fun actividad16(view: View){
        val intent = Intent(this, Actividad16()::class.java)
        startActivity(intent)
    }
    fun actividad17(view: View){
        val intent = Intent(this, Actividad17()::class.java)
        startActivity(intent)
    }
    fun actividad18(view: View){
        val intent = Intent(this, Actividad18()::class.java)
        startActivity(intent)
    }
}