package luku12TiedostonKasittely

import java.io.File

fun main() {
    val file = File("readme.txt")



    while (true) {
        println("Type a line:")
        val word = readLine().toString()

        if (word == "exit") {
            break
        }

        file.appendText("$word\n")
    }

    val content = file.readText()
    println(content)
}
