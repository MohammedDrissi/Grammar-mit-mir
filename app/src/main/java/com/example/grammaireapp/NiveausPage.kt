package com.example.grammaireapp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class NiveausPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_niveaus_page)
        val aa1Button=findViewById<ImageButton>(R.id.A1button)
        aa1Button.setOnClickListener {
            val intent=Intent(this,A1Grammaire::class.java)
            startActivity(intent)
        }
        val a2button=findViewById<ImageButton>(R.id.A2button)
        a2button.setOnClickListener {
            val intent=Intent(this,A2Grammair::class.java)
            startActivity(intent)
        }
        val b1button=findViewById<ImageButton>(R.id.B1button)
        b1button.setOnClickListener {
            val intent=Intent(this,B1Grammair::class.java)
            startActivity(intent)
        }
        val b2button=findViewById<ImageButton>(R.id.B2button)
        b2button.setOnClickListener {
            val intent=Intent(this,B2Grammair::class.java)
            startActivity(intent)
        }
        val c1button=findViewById<ImageButton>(R.id.C1button)
        c1button.setOnClickListener {
            val intent=Intent(this,C1Grammair::class.java)
            startActivity(intent)
        }
        val c2button=findViewById<ImageButton>(R.id.C2button)
        c2button.setOnClickListener {
            val intent=Intent(this,C2Grammair::class.java)
            startActivity(intent)
        }
    }
}