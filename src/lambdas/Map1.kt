package lambdas

fun main() {
    val alunos = arrayListOf("Pedro", "Tiago", "Jonas")
    alunos.map { it.uppercase() }.apply { print(this) }
}