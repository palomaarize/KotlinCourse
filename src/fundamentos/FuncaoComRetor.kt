package fundamentos

fun main(args: Array<String>) {
    println(soma(2,3))
    println(soma(2))
}

fun soma(a: Int, b: Int = 1) : Int{
    return  a + b
}