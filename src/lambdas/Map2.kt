package lambdas

class Produto(val nome: String, val preco: Double)

val materialEscolar = listOf(
    Produto("Caderno", 21.90),
    Produto("Lápis de Cor", 11.90),
    Produto("Borracha", 0.70),
    Produto("Apontador", 1.80)
)

fun main() {
    val totalizar = { total: Double, atual: Double -> total + atual }
    val precoTotal = materialEscolar.map { it.preco }.reduce(totalizar)

    println("O preço médio é R$ ${precoTotal / materialEscolar.size}")
}