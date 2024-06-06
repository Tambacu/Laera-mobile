package com.uninorte.laera2

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val entrar = findViewById<Button>(R.id.login_btn)
        entrar.setOnClickListener() {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}