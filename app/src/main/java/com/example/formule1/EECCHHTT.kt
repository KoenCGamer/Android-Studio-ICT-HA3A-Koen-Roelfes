package com.example.formule1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.ImageView

class EECCHHTT : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_eecchhtt)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val ECHT_ZEKER_ECHT_ZEKER_JA = findViewById<Button>(R.id.button_ECHT_ZEKER_ECHT_ZEKER_JA)
        ECHT_ZEKER_ECHT_ZEKER_JA.setOnClickListener {
            val intent =Intent( this, Bestel::class.java)
            startActivity(intent)
        }
    }
}