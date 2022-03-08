package fundamentos.controle

fun main(args: Array<String>) {
    val alunos = arrayListOf("André", "Marcos", "Paloma")
    for((indice, aluno) in alunos.withIndex()){
        println("$indice - $aluno")
    }

}