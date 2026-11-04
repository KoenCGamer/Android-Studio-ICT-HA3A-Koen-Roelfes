package com.example.formule1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Gegevens : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.gegevens)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val klaargegevens = findViewById<Button>(R.id.klaar_gegevens)
        klaargegevens.setOnClickListener {
            val intent = Intent(this, Bestel::class.java)
            startActivity(intent)

        }



        val page_four_back_button = findViewById<ImageView>(R.id.button_pagefourback)
        page_four_back_button.setOnClickListener {
            finish()
        }
    }
}