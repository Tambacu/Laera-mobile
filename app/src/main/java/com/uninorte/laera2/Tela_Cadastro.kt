package com.uninorte.laera2

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth

class Tela_Cadastro : Activity() {

    private lateinit var auth: FirebaseAuth
    private lateinit var editNome: EditText
    private lateinit var editEmail: EditText
    private lateinit var editSenha: EditText
    private lateinit var btCadastrar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_cadastro)
        actionBar?.hide()

        auth = FirebaseAuth.getInstance()
        iniciarComponentes()

        btCadastrar.setOnClickListener { view ->
            val nome = editNome.text.toString()
            val email = editEmail.text.toString()
            val senha = editSenha.text.toString()

            if (nome.isEmpty() || email.isEmpty() || senha.isEmpty()) {
                Toast.makeText(this, "Preencha todos os campos", Toast.LENGTH_SHORT).show()
            } else {
                cadastrarUsuario(view, email, senha)
            }
        }
    }

    private fun iniciarComponentes() {
        editNome = findViewById(R.id.edit_nome)
        editEmail = findViewById(R.id.edit_email)
        editSenha = findViewById(R.id.edit_senha)
        btCadastrar = findViewById(R.id.bt_cadastro)
    }

    private fun cadastrarUsuario(view: View, email: String, senha: String) {
        auth.createUserWithEmailAndPassword(email, senha)
            .addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    Toast.makeText(this, "Cadastro realizado com sucesso", Toast.LENGTH_SHORT).show()
                    finish()
                } else {
                    val erro = task.exception?.message ?: "Erro ao cadastrar usuário"
                    Toast.makeText(this, erro, Toast.LENGTH_SHORT).show()
                }
            }
    }
}
