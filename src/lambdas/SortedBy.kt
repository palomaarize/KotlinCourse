package lambdas

fun main() {
    val nomes = arrayListOf("Renata", "Paloma", "Bernardo", "Frodo")
    val ordenados = nomes.sortedBy { it.reversed() }
    
    println(ordenados)
}