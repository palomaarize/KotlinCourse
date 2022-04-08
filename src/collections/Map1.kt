package collections

fun main() {
    var map1 = HashMap<Long, String>()
    map1.put(1234567890,"João")
    map1.put(1565456780,"Maria")
    map1.put(1233245220,"Pedro")

    map1.put(1233245220,"Pedro Filho")

    for(par in map1) {
        println(par)
    }

    for(nome in map1.values) {
        println(nome)
    }

    for (cpf in map1.keys) {
        println(cpf)
    }

    for ((cpf, nome) in map1) {
        println("$nome (CPF: $cpf)")
    }

    map1.size.print()
    map1.get(123454542)?.print()
    map1[234564532]?.print()
    map1.contains(4527619893).print()
    map1.remove(1565456780)?.print() //retorna o q foi removido
    map1.clear()
    map1.isEmpty().print()

}