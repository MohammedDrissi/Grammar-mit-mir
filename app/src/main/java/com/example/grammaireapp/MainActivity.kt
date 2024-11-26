package com.example.grammaireapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
       val SofortBeginnenButton=findViewById<Button>(R.id.sofort_beginnen_button)
        SofortBeginnenButton.setOnClickListener {
            val intent=Intent(this,NiveausPage::class.java)
            startActivity(intent)
        }
    }
}