package luku11Poikkeukset



fun main() {
    val array = arrayOf(2,3,4,5)

    println("Type an index:")
    try {
        val i = readLine()!!.toInt()
        array.get(i)
        println(array.get(i))

    }
    catch (e: ArrayIndexOutOfBoundsException) {
        println("Element not found. Index out of bounds")
    }
    catch (e: NumberFormatException) {
        println("Type an integer")
    }
}

