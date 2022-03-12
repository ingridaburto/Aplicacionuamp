package com.example.aplicacionuamp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Actividad24 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad24)
    }
    fun actividad8(view: View){
        val intent = Intent(this, Actividad8()::class.java)
        startActivity(intent)
    }
    fun actividad25(view: View){
        val intent = Intent(this, Actividad25()::class.java)
        startActivity(intent)
    }
    fun actividad26(view: View){
        val intent = Intent(this, Actividad26()::class.java)
        startActivity(intent)
    }
    fun actividad27(view: View){
        val intent = Intent(this, Actividad27()::class.java)
        startActivity(intent)
    }
    fun actividad28(view: View){
        val intent = Intent(this, Actividad28()::class.java)
        startActivity(intent)
    }

}