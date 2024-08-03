package luku10Kokoelmat

fun main() {
    val words = listOf("Kotlin", "Programming", "String", "List", "Algorithm")
    words.toString()


    val filteredWords = words.filter {it.length < 7  }


    println(filteredWords)
}