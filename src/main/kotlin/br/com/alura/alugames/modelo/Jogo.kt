package org.example.br.com.alura.alugames.modelo

data class Jogo(val titulo:String,
           var capa:String) {
           var descricao:String? = null

    override fun toString(): String {
        return "Meu Jogo:\n" +
                "Título= $titulo \n" +
                "Capa= $capa \n" +
                "Descrição= $descricao \n"
    }
}