package classes

class Filme3(nome: String, genero: String, anoDeLAncamento: String) {
    val nome: String
    val genero: String
    val anoDeLAncamento: String

    init {
        this.nome = nome
        this.genero = genero
        this.anoDeLAncamento = anoDeLAncamento
    }
}

fun main() {
    val filme = Filme3("Monstros S. A.", "Animação", "2002")
    println("O filme ${filme.nome} foi uma ${filme.genero} lançada em ${filme.anoDeLAncamento}")
}