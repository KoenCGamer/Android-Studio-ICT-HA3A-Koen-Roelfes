package com.example.formule1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
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

        val voornaam_coureur = findViewById<EditText>(R.id.voornaam_coureur)
        val achternaam_coureur = findViewById<EditText>(R.id.achternaam_coureur)
        val sponsor_coureur = findViewById<EditText>(R.id.sponsor_coureur)





        val klaargegevens = findViewById<Button>(R.id.klaar_gegevens)
        klaargegevens.setOnClickListener {
            val sharedPreferences = getSharedPreferences("UserPreferences", MODE_PRIVATE)
            val editor = sharedPreferences.edit()
            editor.putString("voornaam_coureur", voornaam_coureur.text.toString())
            editor.putString("achternaam_coureur", achternaam_coureur.text.toString())
            editor.putString("sponsor_coureur", sponsor_coureur.text.toString())
            editor.apply()
            val intent = Intent(this, Bestel::class.java)
            startActivity(intent)

        }



        val page_four_back_button = findViewById<ImageView>(R.id.button_pagefourback)
        page_four_back_button.setOnClickListener {
            finish()
        }
    }
}