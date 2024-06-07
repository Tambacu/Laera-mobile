package com.uninorte.laera2

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class MainActivity : Activity() {

    private lateinit var auth: FirebaseAuth
    private lateinit var editEmail: EditText
    private lateinit var editSenha: EditText
    private lateinit var btEntrar: Button
    private lateinit var cadastro: TextView
    private lateinit var progressBar: ProgressBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        actionBar?.hide()

        auth = FirebaseAuth.getInstance()
        iniciarComponentes()

        btEntrar.setOnClickListener {
            val email = editEmail.text.toString()
            val senha = editSenha.text.toString()

            if (email.isEmpty() || senha.isEmpty()) {
                Toast.makeText(this, "Preencha todos os campos", Toast.LENGTH_SHORT).show()
            } else {
                loginUsuario(email, senha)
            }
        }

        cadastro.setOnClickListener {
            val intent = Intent(this, Tela_Cadastro::class.java)
            startActivity(intent)
        }
    }

    private fun iniciarComponentes() {
        editEmail = findViewById(R.id.edit_email)
        editSenha = findViewById(R.id.edit_senha)
        btEntrar = findViewById(R.id.bt_entrar)
        cadastro = findViewById(R.id.text_telacadastro)
        progressBar = findViewById(R.id.progress_bar)
    }

    private fun loginUsuario(email: String, senha: String) {
        progressBar.visibility = View.VISIBLE
        auth.signInWithEmailAndPassword(email, senha)
            .addOnCompleteListener { task ->
                progressBar.visibility = View.INVISIBLE
                if (task.isSuccessful) {
                    val intent = Intent(this, SecondActivity::class.java)
                    startActivity(intent)
                    finish()
                } else {
                    val erro = task.exception?.message ?: "Erro ao fazer login"
                    Toast.makeText(this, erro, Toast.LENGTH_SHORT).show()
                }
            }
    }
}
