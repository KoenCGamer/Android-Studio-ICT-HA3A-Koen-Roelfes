package com.example.formule1

import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.content.Intent

class Weet_Echt_Zeker : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_weet_echt_zeker)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val page_really_sure_back_button = findViewById<ImageView>(R.id.button_weet_echt_zeker_terug)
        page_really_sure_back_button.setOnClickListener {
            finish()

        }
        val weet_echt_zeker_ja = findViewById<Button>(R.id.weet_echt_zeker_ja)
        weet_echt_zeker_ja.setOnClickListener {
            val intent =Intent( this, EECCHHTT::class.java)
            startActivity(intent)
        }
    }
}