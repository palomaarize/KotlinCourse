package lambdas

fun main() {
    val litWithNulls: List<String?> = listOf("A", null, "B", null, "C", null)

    for (item in litWithNulls) {
        item?.let {
            println(it)
        }
    }
}