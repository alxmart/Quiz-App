package com.luizafmartinez.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {

    private lateinit var textInputLayoutNome: TextInputLayout
    private lateinit var editNome: TextInputEditText
    private lateinit var btnIniciar: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        inicializarComponentesInterface()
        inicializarEventosClique()
    }
    private fun inicializarComponentesInterface() {
        textInputLayoutNome = findViewById(R.id.text_input_layout_nome)
        editNome            = findViewById(R.id.edit_nome)
        btnIniciar          = findViewById(R.id.btn_iniciar)
    }
    private fun inicializarEventosClique() {

        btnIniciar.setOnClickListener {
            validarCampos()
        }
    }
    private fun validarCampos() {

        val nome = editNome.text.toString()
        if ( nome.isNotEmpty() ) {
            textInputLayoutNome.error = null

            // Enviar usuario para tela de perguntas
           val intent = Intent(
               this,
               PerguntasActivity::class.java
           )
            intent.putExtra("nome", nome)
            startActivity( intent )
        } else {
            // Fica vermelho e aparece mensagem de erro
            textInputLayoutNome.error = "Preencha seu nome para prosseguir"
        }
    }
}