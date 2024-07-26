package luku5Ehdot

fun main() {
    println("Type the first number:")
    val first = readLine()!!.toInt()
    println("Type the second number:")
    val second = readLine()!!.toInt()
    println("Type the third number:")
    val third = readLine()!!.toInt()

    if (first > second && first > third) {
        println("The largest number = $first")
    } else if (second > first && second > third) {
        println("The largest number = $second")
    } else {
        println("The largest number = $third")
    }
}