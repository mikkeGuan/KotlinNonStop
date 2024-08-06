package luku10Kokoelmat

fun main() {
    val words = mutableMapOf(1 to "Kotlin", 2 to "Java", 3 to "C#", 4 to "JavaScript")

    println("Enter a programming language:")
    val input = readLine()

    if (words.containsValue(input)) {
        println("Value found")
    } else {
        println("Value not found")
    }


}