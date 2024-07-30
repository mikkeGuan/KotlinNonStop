package luku7Funktiot


fun main() {
    println("Type the first integer:")
    var first = readLine()!!.toInt()

    println("Type the second integer:")
    var second = readLine()!!.toInt()

    println("Type the third integer:")
    var third = readLine()!!.toInt()

    val max = findMax(first, second, third)
    println("The largest one is: $max")
}

fun findMax(first: Int, second: Int, third: Int): Int {
    return maxOf(first, second, third)
}


