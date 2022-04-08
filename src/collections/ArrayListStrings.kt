package collections

fun main() {
    val strings = arrayListOf("Carro", "Moto", "Barco", "Avião")

    //infere o tipo a partir dos dados
    for(item in strings) {
        println(item.uppercase())
    }
}