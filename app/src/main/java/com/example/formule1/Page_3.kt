package com.example.formule1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Page_3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_page3)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        val result = findViewById<TextView>(R.id.viewtest)
        val teamnaam = intent.getStringExtra("teamnaam").toString();
        val naam = intent.getStringExtra("naam").toString();
        val email = intent.getStringExtra("email").toString();
        result.text = "Teamnaam = $teamnaam Naam = $naam E-Mail = $email.";


        val coureuryes = findViewById<Button>(R.id.coureurja)
        coureuryes.setOnClickListener {
            Toast.makeText(this, "Pro Speedrunner/Pro Programeerder", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, Gegevens::class.java)
            startActivity(intent)

        }

        val coureurno = findViewById<Button>(R.id.coureurnee)
        coureurno.setOnClickListener {
            Toast.makeText(this, "Pro Speedrunner/Pro Programeerder", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, Weet_Zeker::class.java)
            startActivity(intent)

        }
        val page_three_back_button = findViewById<ImageView>(R.id.button_pagethreeback)
        page_three_back_button.setOnClickListener {
            finish()

        }
    }
}