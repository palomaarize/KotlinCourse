package funcoes

inline fun transacao(funcao: () -> Unit) {
    println("Abrindo transação")
    try {
        funcao()
    } finally {
        println("Fechando transação")
    }
}
fun main(args: Array<String>) {
    transacao {
        println("Executando 1")
        println("Executando 2")
        println("Executando 3")

    }
}