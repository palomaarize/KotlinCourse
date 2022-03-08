package fundamentos.controle

fun main(args: Array<String>) {
    val nota = 9

    when(nota){
        10, 9 -> print("Fantástio")
        8, 7 -> print("Parabéns")
        6, 5, 4 -> print("Tem como recuperar")
        in 0..3 -> print("Te vejo semestr que vem")
        else -> println("Nota inválida")
    }
}