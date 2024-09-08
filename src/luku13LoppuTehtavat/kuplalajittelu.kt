package luku13LoppuTehtavat

fun main(args: Array<String>) {
    val list = mutableListOf<Int>()
    print("Anna lajiteltavien numeroiden lukumäärä: ")
    val number = readLine()!!.toInt()
    for (i in 1..number) {
        print("Anna taulukon $i numero: ")
        var value = readLine()!!.toInt()
        list.add(value)
    }
    bubbleSort(list)
    println("Lajiteltu lista nousevassa järjestyksessä: $list")
}

fun bubbleSort(array: MutableList<Int>) {
    val size = array.size
    for (i in 0 until size - 1) {
        for (j in 0 until size - i - 1) {
            if (array[j] > array[j + 1]) {
                val temp = array[j]
                array[j] = array[j + 1]
                array[j + 1] = temp
            }
        }
    }
}
