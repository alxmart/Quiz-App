package com.luizafmartinez.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout

class PerguntasActivity : AppCompatActivity() {

    private lateinit var textExibicaoNome: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perguntas)
        inicializarComponentesInterface()
    }
    private fun inicializarComponentesInterface() {

        textExibicaoNome = findViewById(R.id.text_exibicao_nome)

        val bundle = intent.extras
        val nome = bundle?.getString("nome")
        if (nome != null) {
            textExibicaoNome.text = "Olá, $nome"
        }
    }

//    inicializarEventosClique(){
//    }

}


