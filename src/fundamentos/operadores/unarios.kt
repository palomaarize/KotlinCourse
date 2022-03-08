package fundamentos.operadores

fun main(args: Array<String>) {
    var a: Int = 1
    var b: Int = 2

    a++
    println(a)
    --a
    println(a)

    //Incremento e decremento
    //pré fixado tem precedencia na comparaçãp
    println(++a == b--)
}