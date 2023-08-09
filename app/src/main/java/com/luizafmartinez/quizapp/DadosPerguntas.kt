package com.luizafmartinez.quizapp
class DadosPerguntas {
    companion object {
        fun retornarListaPerguntas() : List<Pergunta> {

            val pergunta1 = Pergunta(
                "Qual a duração do primeiro vídeo do youTube ?",
                "30 segundos",
                "1 minuto",
                "3 minutos",
                1
            )
            val pergunta2 = Pergunta(
                "Qual o nome da estrela do nosso sistema solar ?",
                "Cometa",
                "Sol",
                "Marte",
                2
            )
            val pergunta3 = Pergunta(
                "Qual sistema operacional é utilizado no iPhone ?",
                "Android",
                "Linux",
                "iOS",
                3
            )

            return listOf(
                pergunta1,
                pergunta2,
                pergunta3
            )

        }

    }

}










