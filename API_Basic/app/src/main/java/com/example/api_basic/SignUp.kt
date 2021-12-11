package com.example.api_basic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        var hps: Button = findViewById(R.id.hps)
        hps.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)

            // start the activity connect to the specified class

            // start the activity connect to the specified class
            startActivity(intent)
        }
    }
}