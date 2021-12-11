package com.example.api_basic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Sign_Log : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_log)
        var signUp: Button = findViewById(R.id.signUp)
        var logIn: Button = findViewById(R.id.logIn)
        signUp.setOnClickListener {
            val intent = Intent(this, SignUp::class.java)

            // start the activity connect to the specified class

            // start the activity connect to the specified class
            startActivity(intent)
        }
        logIn.setOnClickListener {
            val intent = Intent(this, LogIn::class.java)

            // start the activity connect to the specified class

            // start the activity connect to the specified class
            startActivity(intent)
        }
    }
}