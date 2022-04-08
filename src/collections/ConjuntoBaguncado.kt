package collections

fun Any.print() = println(this)

fun main() {
    val conjunto = hashSetOf(3, 'a', "texto", true, 3.14)

    conjunto.add(3).print() //set n aceita repetição
    conjunto.add(10).print()

    conjunto.size.print()

    conjunto.remove("a").print() //false
    conjunto.remove('a').print() // true

    conjunto.contains('a').print()
    conjunto.contains("texto").print()

    val nums = setOf(1, 2, 3) //somente leitura

    (conjunto + nums).print()
    (conjunto - nums).print()

    conjunto.intersect(nums).print() // nao muda o conjunto
    conjunto.retainAll(nums) // muda o conjunto
    conjunto.print()

    conjunto.clear()
}