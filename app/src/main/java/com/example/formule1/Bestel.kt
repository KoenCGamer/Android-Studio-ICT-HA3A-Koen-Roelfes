package com.example.formule1

import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.TextView
import android.text.Html

class Bestel : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_bestel)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val sharedPreferences = getSharedPreferences("UserPreferences", MODE_PRIVATE)
        val naam = sharedPreferences.getString("naam", "")
        val email = sharedPreferences.getString("email", "")
        val teamnaam = sharedPreferences.getString("teamnaam", "")
        val voornaam_coureur = sharedPreferences.getString("voornaam_coureur", "")
        val achternaam_coureur = sharedPreferences.getString("achternaam_coureur", "")
        val sponsor_coureur = sharedPreferences.getString("sponsor_coureur", "")



            val textView = findViewById<TextView>(R.id.textView8)
         val htmlTekst = "Informatie:<br>" +
              "- $naam <br>" +
              "- $teamnaam <br>" +
              "- $email <br>" +
              "- $voornaam_coureur <br>" +
              "- $achternaam_coureur <br>" +
              "- $sponsor_coureur <br>" +
              "- <br>" +
              "- <br>" +
                 "- <br>" +
               "- <br>" +
                "- <br>" +
                "- <br>" +
                "- <br>" +
                "- <br>"


        textView.text = Html.fromHtml(htmlTekst, Html.FROM_HTML_MODE_COMPACT)





        val bestel_terug = findViewById<ImageView>(R.id.button_bestel_back)
        bestel_terug.setOnClickListener {
            finish()
        }


    }
}