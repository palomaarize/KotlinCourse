package collections

fun main() {
    val alunos = arrayListOf("Amanda", "Paulo", "Pedro")

    for (aluno in alunos) {
        println(aluno)
    }

    for((indice, aluno) in alunos.withIndex()) {
        println("$indice - $aluno")
    }
}