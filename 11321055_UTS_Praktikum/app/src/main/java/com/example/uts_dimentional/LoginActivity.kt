package com.example.uts_dimentional

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class LoginActivity : AppCompatActivity() {
    private lateinit var username: EditText
    private lateinit var password: EditText
    private lateinit var loginButton: Button
    private lateinit var registerButton: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        username = findViewById(R.id.username)
        password = findViewById(R.id.password)
        loginButton = findViewById(R.id.btn_login)
        registerButton = findViewById(R.id.btn_register)

        loginButton.setOnClickListener {
            // when login button is clicked, go to home activity
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        registerButton.setOnClickListener {
            // when login button is clicked, go to home activity
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}