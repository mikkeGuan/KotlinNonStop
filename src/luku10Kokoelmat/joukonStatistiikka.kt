package luku10Kokoelmat

fun main() {
    val numbers = mutableListOf<Int>()
   var integer : Int


    while (true) {
        println("Type a positive integer (-1 exits):")
        integer = readLine()!!.toInt()

        if (integer == -1) {
            println("The average = ${numbers.average()}")
            println("The max = ${numbers.max()}")
            println("The min = ${numbers.min()}")
            break
        }
        if (integer > 0) {
            numbers.add(integer)

        }

    }


}