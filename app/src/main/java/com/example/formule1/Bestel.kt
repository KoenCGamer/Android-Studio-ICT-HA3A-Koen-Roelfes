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

        // val result = findViewById<TextView>(R.id.textView8)
        // val teamnaam = intent.getStringExtra("teamnaam").toString();
        // val naam = intent.getStringExtra("naam").toString();
        // val email = intent.getStringExtra("email").toString();
        // result.text = "Teamnaam = $teamnaam Naam = $naam E-Mail = $email.";

       // val textView = findViewById<TextView>(R.id.textView8)
        // val htmlTekst = "Informatie:<br>" +
        //      "- $naam <br>" +
        //      "- <br>" +
        //      "- <br>" +
        //      "- <br>" +
        //      "- <br>" +
        //      "- <br>" +
        //      "- <br>" +
        //      "- <br>" +
        //         "- <br>" +
        //       "- <br>" +
        //        "- <br>" +
        //        "- <br>" +
        //        "- <br>" +
        //        "- <br>" +
        //        "- <br>" +
        //        "- <br>" +
        //        "- <br>"


       // textView.text = Html.fromHtml(htmlTekst, Html.FROM_HTML_MODE_COMPACT)

        val textView = findViewById<TextView>(R.id.textView8)

// Haal eerst de gegevens op via de Intent
        val teamnaam = intent.getStringExtra("teamnaam") ?: ""
        val naam = intent.getStringExtra("naam") ?: ""
        val email = intent.getStringExtra("email") ?: ""

// Stop ze vervolgens in je HTML-tekststructuur
        val htmlTekst = "Informatie:<br>" +
                "- Team: <u>$teamnaam</u><br>" +
                "- Naam: <u>$naam</u><br>" +
                "- E-mail: <u>$email</u><br>"

        textView.text = Html.fromHtml(htmlTekst, Html.FROM_HTML_MODE_COMPACT)

        val bestel_terug = findViewById<ImageView>(R.id.button_bestel_back)
        bestel_terug.setOnClickListener {
            finish()
        }


    }
}