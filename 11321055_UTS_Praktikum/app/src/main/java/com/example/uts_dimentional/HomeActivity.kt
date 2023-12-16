package com.example.uts_dimentional

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val button_logout = findViewById(R.id.btn_logout) as Button
        val button_persegi = findViewById(R.id.btnPersegi) as Button
        val button_persegi_panjang = findViewById(R.id.btnPersegiPanjang) as Button
        val button_segitiga = findViewById(R.id.btnSegitiga) as Button
        val button_lingkaran = findViewById(R.id.btnLingkaran) as Button
        val button_kubus = findViewById(R.id.btnKubus) as Button
        val button_balok = findViewById(R.id.btnBalok) as Button
        val button_bola = findViewById(R.id.btnBola) as Button
        val button_prisma = findViewById(R.id.btnPrisma) as Button

        button_logout.setOnClickListener {
            finish()
        }

        button_persegi.setOnClickListener {
            val intent = Intent(this, PersegiActivity::class.java)
            startActivity(intent)
        }

        button_persegi_panjang.setOnClickListener {
            val intent = Intent(this, PersegiPanjangActivity::class.java)
            startActivity(intent)
        }

        button_segitiga.setOnClickListener {
            val intent = Intent(this, SegitigaActivity::class.java)
            startActivity(intent)
        }

        button_lingkaran.setOnClickListener {
            val intent = Intent(this, LingkaranActivity::class.java)
            startActivity(intent)
        }

        button_kubus.setOnClickListener {
            val intent = Intent(this, KubusActivity::class.java)
            startActivity(intent)
        }

        button_balok.setOnClickListener {
            val intent = Intent(this, BalokActivity::class.java)
            startActivity(intent)
        }

        button_bola.setOnClickListener {
            val intent = Intent(this, BolaActivity::class.java)
            startActivity(intent)
        }

        button_prisma.setOnClickListener {
            val intent = Intent(this, PrismaActivity::class.java)
            startActivity(intent)
        }

    }
}