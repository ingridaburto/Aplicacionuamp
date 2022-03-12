package com.example.aplicacionuamp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Actividad29 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad29)
    }
    fun actividad8(view: View){
        val intent = Intent(this, Actividad8()::class.java)
        startActivity(intent)
    }
    fun actividad30(view: View){
        val intent = Intent(this, Actividad30()::class.java)
        startActivity(intent)
    }
    fun actividad31(view: View){
        val intent = Intent(this, Actividad31()::class.java)
        startActivity(intent)
    }

    fun actividad32(view: View){
        val intent = Intent(this, Actividad32()::class.java)
        startActivity(intent)
    }
    fun actividad33(view: View){
        val intent = Intent(this, Actividad33()::class.java)
        startActivity(intent)
    }
}