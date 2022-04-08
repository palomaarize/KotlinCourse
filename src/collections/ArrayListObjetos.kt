package collections

data class Fruta (var nome: String, var preco: Double)

fun main() {
    var frutas = arrayListOf(Fruta("Banana", 2.5), Fruta("Morango", 5.6), Fruta("Manga", 5.6))

    for(fruta in frutas) {
        println("${fruta.nome} - R$ ${fruta.preco}")
    }

    println(frutas.contains(Fruta("Banana", 2.5)))
    println(frutas.distinctBy { it.preco })
}