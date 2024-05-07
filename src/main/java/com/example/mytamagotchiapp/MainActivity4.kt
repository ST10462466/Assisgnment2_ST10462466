package com.example.mytamagotchiapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity4 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        val btnplay = findViewById<Button>(R.id.btnplay)
        val textView4 = findViewById<TextView>(R.id.textView4)
        textView4.text = "5"
        val textView6 = findViewById<TextView>(R.id.textView6)
        textView6.text = "5"
        btnplay.setOnClickListener {
            val intent = Intent(this@MainActivity4,MainActivity5 ::class.java)
            startActivity(intent)
        }
    }
}