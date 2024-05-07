package com.example.mytamagotchiapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        val textView10 = findViewById<TextView>(R.id.textView10)
        textView10.text = "5"
        val textView11 = findViewById<TextView>(R.id.textView11 )
        textView11.text = "5"
        val textView12 = findViewById<TextView>(R.id.textView12 )
        textView12.text = "5"
    }
}