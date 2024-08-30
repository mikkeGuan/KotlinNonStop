package luku13LoppuTehtavat

fun main(args: Array<String>) {
    var list = mutableListOf<Int>()
    print("Anna lajiteltavien numeroiden lukumäärä :")
    var number = readLine()!!.toInt()
    for (i in 1..number) {
        print("Anna taulukon $i numero :")
        var value = readLine()!!.toInt()
        list.add(value)
    }
    val sorted = bubbleSort(list)
    println("Lajiteltu lista nousevassa järjestyksessä: $sorted")
}


fun bubbleSort(array: MutableList<Int>) {

}