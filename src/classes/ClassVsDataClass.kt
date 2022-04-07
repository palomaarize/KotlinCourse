package classes

class Geladeira(val marca: String, val litros: Int)
data class Televisao(val marca: String, val polegadas: Int)

fun main(args: Array<String>) {
       val g1 = Geladeira("Brastemp", 500)
       val g2 = Geladeira("Brastemp", 500)
    println(g1 == g2) //comparando endereço de memoria

    val tv1 = Televisao("Samsung", 32)
    val tv2 = Televisao("Samsung", 32)
    println(tv1 == tv2) //por ser data class ele faz o equals pelas propriedades

    println(tv1.toString())
    println(tv1.copy())
    println(tv1.copy("LG"))

    //Destructuring
    val (marca, polegadas) = tv1

    println(marca)
    println(polegadas)
}