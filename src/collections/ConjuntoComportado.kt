package collections

fun main() {
    val aprovados = hashSetOf("João", "Maria", "Pedro", "Ana", "Joana")

    println("Sem ordem...")
    for (aprovado in aprovados) {
        aprovado.print()
    }

    println("\nLinked...")
    val aprovadosNaOrdem = linkedSetOf("João", "Maria", "Pedro", "Ana", "Joana")
    for (aprovado in aprovadosNaOrdem) {
        aprovado.print()
    }

    println("\nSorted")
    val aprovadosNaOrdem2 = sortedSetOf("João", "Maria", "Pedro", "Ana", "Joana")
    for (aprovado in aprovadosNaOrdem2) {
        aprovado.print()
    }

    //Ordem maluca
    aprovados.sortedBy { it.substring(1) }.print()
}