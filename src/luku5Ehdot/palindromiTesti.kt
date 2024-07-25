package luku5Ehdot

fun main(args: Array<String>) {
    println("Type a word:")
    val word = readLine()!!.toString().lowercase()

    if (word.reversed() == word) {
        println("The word $word is palindrome")
    } else {
        println("The word $word is not palindrome")
    }

}