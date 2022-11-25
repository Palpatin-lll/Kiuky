package com.example.kyukiproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)

        val button = findViewById<Button>(R.id.btnGlass)
        button.setOnClickListener{
            val intent = Intent(this@MainMenu, mapsglass::class.java)
            startActivity(intent)
        }

        val button1 = findViewById<Button>(R.id.btnCardboard)
        button1.setOnClickListener{
            val intent = Intent(this@MainMenu, mapscardboard::class.java)
            startActivity(intent)
        }

        val button2 = findViewById<Button>(R.id.btnPlastic)
        button2.setOnClickListener{
            val intent = Intent(this@MainMenu, mapsplastic::class.java)
            startActivity(intent)
        }
    }
}