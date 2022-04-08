package lambdas

data class Aluno(val nome: String, val nota: Double)

fun main() {
    val alunos = arrayListOf(
        Aluno("Alan", 7.0),
        Aluno("Paloma", 8.8),
        Aluno("João", 2.3),
        Aluno("Ricardo", 4.5)
    )

    val aprovados = alunos.filter { it.nota >= 7.0 }.sortedBy { it.nome }

    print(aprovados)
}