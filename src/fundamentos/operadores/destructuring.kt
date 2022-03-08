package fundamentos.operadores

data class Carro(val marca: String, val modelo: String)

fun main(args: Array<String>) {
    val (marca, modelo) = Carro("Ford", "Fusion")
    println("$marca e $modelo")

    val (marido, mulher) = listOf("João", "Maria")
    println("$marido, $mulher")

    val (_,_, terceiroLugar) = listOf("Kimi", "Lewis", "Alonso")
    println("$terceiroLugar ficou em terceiro lugar no grid")
}