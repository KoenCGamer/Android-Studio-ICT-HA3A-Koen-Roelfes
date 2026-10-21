package com.example.formule1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.ImageView
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val teamname = findViewById<EditText>(R.id.editTextText1)
        val name = findViewById<EditText>(R.id.editTextText3)
        val email = findViewById<EditText>(R.id.editTextText2)

        val next_button_page_2 = findViewById<Button>(R.id.to_next_page_3)
        next_button_page_2.setOnClickListener {
            val teamnaam = teamname.text.toString();
            val naam = name.text.toString();
            val email = email.text.toString();
            Toast.makeText(this, "Pro Speedrunner/Pro Programeerder", Toast.LENGTH_SHORT).show();
            intent.putExtra("teamnaam", teamnaam);
            intent.putExtra("naam", naam);
            intent.putExtra("email", email);
            val intent = Intent(this, Page_3::class.java);
            startActivity(intent)
        }



        val page_two_back_button = findViewById<ImageView>(R.id.button_pagetwoback)
        page_two_back_button.setOnClickListener {
            finish()


        }
    }
}