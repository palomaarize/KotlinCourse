package classes

class Produto(var nome: String, var preco: Double, var desconto: Double, var ativo: Boolean) {
    val precoComDesconto: Double get() = preco * (1 - desconto)
    val inativo: Boolean get() = !ativo
}

fun main() {
    val celular = Produto("Iphone 13", 5600.99, 0.20, ativo = true)
    println("O produto ${celular.nome} está por ${celular.precoComDesconto}")

    val geladeira = Produto("Brastemp 2 Portas", 5000.00, 0.10, ativo = false)

    if (geladeira.inativo) {
        geladeira.preco = 0.0
        println("O produto ${geladeira.nome} está inativa Valor: ${geladeira.precoComDesconto}")
    }

    val ACCOUNT_STATUS_VALIDS = arrayOf("ENABLED", "BLOCKED", "BLOCKED_BY_PROVIDER")

    if(!ACCOUNT_STATUS_VALIDS.contains("ENABLED")){
        println("Funciona")
    }
}