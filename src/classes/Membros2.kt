package classes

class Calculadora {
    private var resultado: Int = 0

    fun somar(vararg valores: Int): Calculadora {
        valores.forEach { resultado += it }
        return this
    }

    fun multiplicar(valor: Int): Calculadora {
        resultado *= valor
        return this
    }

    fun limpar(): Calculadora {
        resultado = 0
        return this
    }

    fun print(): Calculadora {
        println(resultado)
        return this
    }

    fun resultadoFinal(): Int {
        return resultado
    }
}

    fun main(args: Array<String>) {
        val calculadora = Calculadora()
        val novoValor = calculadora.somar(3,4,1).multiplicar(2).print()
        println(novoValor.limpar().resultadoFinal())
    }