package luku5Ehdot
import java.util.Scanner

fun main() {
    val scanner = Scanner(System. `in`)
    println("Type a month number (1-12)")
    val month = scanner.nextInt()
    val monthName = when (month) {
        1 -> println("January")
        2 -> println("February")
        3 -> println("March")
        4 -> println("April")
        5 -> println("May")
        6 -> println("June")
        7 -> println("July")
        8 -> println("August")
        9 -> println("September")
        10 -> println("October")
        11 -> println("November")
        12 -> println("December")
        else -> println("Error")
    }

}