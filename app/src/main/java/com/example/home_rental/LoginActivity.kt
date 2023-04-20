package com.example.home_rental

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btn_login = findViewById<Button>(R.id.btn_login)

        btn_login.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            finishAffinity()
            startActivity(intent)
        }

    }
}