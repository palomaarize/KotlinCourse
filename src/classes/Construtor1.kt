package classes

class Filme {
    val nome: String
    val genero: String
    val anoDeLancamento: String

    constructor(nome: String, genero: String, anoDeLancamento: String) {
        this.nome = nome
        this.genero = genero
        this.anoDeLancamento = anoDeLancamento
    }
}

fun main(args: Array<String>) {
    val filme = Filme("O Poderoso Chefão", "Drama", "1972")

    println("No ano de ${filme.anoDeLancamento} o ${filme.genero} '${filme.nome}' foi lançado")
}