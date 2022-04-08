package lambdas

fun main() {
    val soma = { x: Int, y: Int ->
        x + y
        1 + 3 } //Ele retorna a última sentença de código
    println(soma(4, 6))
}