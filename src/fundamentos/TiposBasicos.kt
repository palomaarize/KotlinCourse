package fundamentos

fun main(args: Array<String>) {
    //Tipos numéricos inteiros em seus máximos .MAX_VALUE
    val num1: Byte = 127 //1 byte - 8 bits
    val num2: Short = 32767  //2 bytes
    val num3: Int =  2_147_483_647 //4 bytes
    val num4: Long = 9223372036854775807 //8 bytes

    //Tipos numéricos reais
    val num5: Float = 3.14F //4 bytes -Qualquer literal com ponto flutuante é considerado double, por isso marcamos F pra determinar float
    val num6: Double = 3.14 //8 bytes

    //Tipo caractere
    val char: Char = '?'

    //Tipo booleano
    val boolean: Boolean = true //ou false e n 1 ou 0

    println(listOf(num1, num2, num3, num4, num5, num6, char, boolean))

    println(2 is Int)
    println(2154637247 is Long)
    println(1.0 is Double)

    //Tudo é objeto
    println(10.dec())
}