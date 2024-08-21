package luku12TiedostonKasittely

import java.io.File

fun main() {
    val file = File("numbers.txt")
    val numbers = mutableListOf<Int>()

    while (true) {
        println("Type a positive integer (-1 to exit):")
        val integer = readLine()!!.toInt()

        if (integer == -1) {
            file.forEachLine {
                if (file.exists()) {
                    numbers.add(it.toInt())

                }
            }
            println("You typed ${numbers.count()} numbers")
            println("The average is ${numbers.average()}")
            break
        }
        else if (integer <= 0) {
            println("The number must be positive")
        } else {
            file.appendText("${integer.toInt()}\n")
        }


    }
}