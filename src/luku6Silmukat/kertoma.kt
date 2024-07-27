package luku6Silmukat

fun main() {
    println("Type an integer:")
    val num = readLine()!!.toInt()
    var factorial = 1
    for (i in 1..num) {
        factorial *= i.toInt()

    }
    println("The factorial of $num = $factorial")
}