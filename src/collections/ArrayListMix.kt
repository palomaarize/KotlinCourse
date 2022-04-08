package collections

fun main() {
    val listMix = arrayListOf("Rafael", true, 1, 1.98, 'p')

    for(item in listMix) {
        if(item is String) { //smart cast
            println(item.uppercase())
        } else {
            println("Outro itens: $item")
        }

    }
}