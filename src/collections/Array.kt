package collections

fun main() {
    val numeros = Array<Int>(10) { i -> i * 10 }

    for(numero in numeros) {
        println(numero)
    }
    println(numeros[4])
    println(numeros.size)
    numeros[1] = 1234

    println(numeros[1])
}