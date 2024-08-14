package luku12TiedostonKasittely

import java.io.File

fun main() {
    val list = mutableListOf<String>()
    val file = File("readme.txt")

    while (true) {
        println("Type a line: ")
        val word = readLine().toString()

        if (word == "exit") {
            break
        }

        list.add(word)
        file.writeText(list.joinToString(separator = "\n"))
    }
}
