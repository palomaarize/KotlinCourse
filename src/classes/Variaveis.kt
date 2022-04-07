package classes

val variavelDoArquivo = "Bom dia"

fun funcaoTopLevel(){
    val varTopLevel = "Salvador"
    println("${variavelDoArquivo} $varTopLevel")
}

class Coisa{
    var variavelDeInstancia: String = "São 08 horas"

    companion object{
        @JvmStatic val variavelDeClasse: String = "Vamos as noticias"
    }

    fun fazer() {
        var local = 7

        if (local > 3) {
            val varDeBloco = "locais"
            println("$variavelDoArquivo $variavelDeInstancia $variavelDeClasse $varDeBloco")
        }
    }
}

fun main(args: Array<String>) {
    funcaoTopLevel()
    Coisa().fazer()
    println(Coisa.variavelDeClasse)
}