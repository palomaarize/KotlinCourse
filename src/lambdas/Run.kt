package lambdas

data class Casa(var endereco: String = "", var num: Int = 0)

fun main() {
    var casa = Casa()

    casa.run {
        endereco = "Rua Abc"
        num = 15432
    }

    println(casa)
}