package classes

class Cliente2 {
    constructor(nome: String) {
        this.nome = nome
    }
    var nome: String
        get() = "Meu nome é $field"
        set(value) {
            field = value.takeIf { value.isNotEmpty() } ?: "Anônimo"
        }
}

fun main() {
    val cliente = Cliente2("Paloma")
    println(cliente.nome)

    val otoCliente = Cliente2("")
    println(otoCliente.nome)
}