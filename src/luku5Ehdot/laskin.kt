package luku5Ehdot

import java.util.Scanner

fun main() {
    val scanner = Scanner(System. `in`)
    println("Type the first number:")
    val first = scanner.nextInt()

    println("Type the second number:")
    val second = scanner.nextInt()

    println("Type the operator (+,-,*):")
    val operator = scanner.next()

    when (operator) {
        "+" -> {
            val sum = first + second
            println("$first + $second = $sum" )
        }
        "-" -> {
            val diff = first - second
            println("$first - $second = $diff" )
        }
        else -> {
            val prod = first * second
            println("$first * $second = $prod" )
        }
    }

}

/*
Type the first number:
5
Type the second number:
12
Type the operator (+,-,*):
+
5 + 12 = 17*/
