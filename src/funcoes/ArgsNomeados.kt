package funcoes

fun relacaoDeTrabalho(chefe: String, funcionanrio: String): String {
    return "$funcionanrio é subordinado $chefe"
}

fun main(args: Array<String>) {
    println(relacaoDeTrabalho("João", "Maria"))
    println(relacaoDeTrabalho(funcionanrio = "João", chefe = "Maria"))
}