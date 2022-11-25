 package com.example.kyukiproject

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

 class MainActivity : AppCompatActivity() {
     override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)
         setContentView(R.layout.activity_main)

         val button = findViewById<Button>(R.id.StartApp)
         button.setOnClickListener{
             val intent = Intent(this@MainActivity, MainMenu::class.java)
                startActivity(intent)
         }
     };
 }
