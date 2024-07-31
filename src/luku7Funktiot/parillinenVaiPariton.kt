package luku7Funktiot

fun main() {
    println("Type an integer:")
    var number = readLine()!!.toInt()
    println(isEven(number))
}

fun isEven(number: Int): String {
    if (number % 2 == 0) {
        return "Even"
    } else {
return "Odd"
    }
}