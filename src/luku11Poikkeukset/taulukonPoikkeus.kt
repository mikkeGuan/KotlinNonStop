package luku11Poikkeukset

fun main() {
    val array = arrayOf(1,2,3,4)

    try {
        array.get(7)
    }
    catch (e: ArrayIndexOutOfBoundsException) {
        println("Element not found. Index out of bounds")
    }

}