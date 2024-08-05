package luku10Kokoelmat

fun main() {
    val names = listOf("Jim", "Mary", "Matt", "Priscilla", "Mike", "Kelly")
    val filtered = names.filter { it.startsWith("M") }.count()
    println(filtered)

}