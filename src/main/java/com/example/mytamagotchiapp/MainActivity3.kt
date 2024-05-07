package com.example.mytamagotchiapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)


        val btnclean = findViewById<Button>(R.id.btnclean)
        val valeur = findViewById<TextView>(R.id.textView2)
        valeur.text = "5"

        btnclean.setOnClickListener {
            val intent = Intent(this@MainActivity3,MainActivity4 ::class.java)
            startActivity(intent)
        }
    }
}