package fundamentos

fun souEsperto(x: Any){
    if (x is String) println(x.uppercase())
    else if (x is Int) println(x.plus(3))
}
fun souEsperto2(x: Any){
    when (x) {
        is String -> println(x.uppercase())
        is Int -> println(x.plus(3))
        else -> println("Repense viu?")
    }
}

fun main(args: Array<String>) {
    souEsperto("Olá")
    souEsperto(9)

    souEsperto2("Opa")
    souEsperto2(3)
    souEsperto2(true)
}