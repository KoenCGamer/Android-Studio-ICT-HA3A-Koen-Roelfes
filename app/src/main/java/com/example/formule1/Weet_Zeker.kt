package com.example.formule1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Weet_Zeker : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_weet_zeker)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val weet_zeker_ja = findViewById<Button>(R.id.weet_zeker_ja)
        weet_zeker_ja.setOnClickListener {
            val intent = Intent(this, Weet_Echt_Zeker::class.java)
            startActivity(intent)

        }
        val page_weet_zeker_back_button = findViewById<ImageView>(R.id.button_weet_zeker_terug)
        page_weet_zeker_back_button.setOnClickListener {
            finish()

        }
    }
}