package com.luizafmartinez.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout

class PerguntasActivity : AppCompatActivity() {

    // Componentes
    private lateinit var textExibicaoNome : TextView
    private lateinit var textExibicaoREsumo : TextView
    private lateinit var textTitulo : TextView
    private lateinit var radioResposta1 : RadioButton
    private lateinit var radioResposta2 : RadioButton
    private lateinit var radioResposta3 : RadioButton
    private lateinit var btnConfirmar : Button



    private lateinit var listaPerguntas : List<Pergunta>
    private lateinit var perguntaAtual : Pergunta
    private var indicePerguntaAtual = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perguntas)

        inicializarComponentesInterface()

        // Carregar dados
        // Pergunta1, pergunta2, pergunta3
        listaPerguntas = DadosPerguntas.retornarListaPerguntas()

        exibirDadosPerguntaAtual()

    }

    private fun exibirDadosPerguntaAtual() {

        perguntaAtual = listaPerguntas[indicePerguntaAtual]
        // Exibir os dados

    }

    override fun onStart() {
        super.onStart()
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


