package com.example.uts_dimentional

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class RegisterActivity : AppCompatActivity() {

    private lateinit var nik: EditText
    private lateinit var fullname: EditText
    private lateinit var nomor_hp: EditText
    private lateinit var username: EditText
    private lateinit var password: EditText
    private lateinit var registerButton: Button
    private lateinit var loginButton: Button

    override fun onStart() {
        super.onStart()
        setContentView(R.layout.activity_register)

        nik = findViewById(R.id.nik)
        fullname = findViewById(R.id.nama_lengkap)
        nomor_hp = findViewById(R.id.no_hp)
        username = findViewById(R.id.username)
        password = findViewById(R.id.password)
        registerButton = findViewById(R.id.btn_register)
        loginButton = findViewById(R.id.btn_login)

        registerButton.setOnClickListener {
            // when register button is clicked, go to home activity
            // send data to home activity
            val intent = Intent(this, LoginActivity::class.java)
            intent.putExtra("nik", nik.text.toString())
            intent.putExtra("fullname", fullname.text.toString())
            intent.putExtra("nomor_hp", nomor_hp.text.toString())
            intent.putExtra("username", username.text.toString())
            intent.putExtra("password", password.text.toString())
            startActivity(intent)
        }

        loginButton.setOnClickListener {
            // when login button is clicked, go to home activity
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}