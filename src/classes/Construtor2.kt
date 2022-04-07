package classes

class Filme2(val nome: String, val genero: String, val anoDeLancamento: String)

fun main(args: Array<String>) {
    val filme = Filme2("Crepúsculo", "Suspense", "2009")
    println("Em ${filme.anoDeLancamento} o ${filme.genero} ${filme.nome} foi lançado")
}