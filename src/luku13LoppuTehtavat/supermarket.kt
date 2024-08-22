package luku13LoppuTehtavat

fun main() {
    val hinnat = arrayOf(10,14,22,33,44,13,22,55,66,77)
    val ostoskarry = mutableListOf<Int>()

    println("Supermarket")
    println("===========")

    while (true) {
        print("Valitse tuote (1-10) 0 lopetus:")
        val indeksi = readLine()!!.toInt()

        if (indeksi == 0) {

            println("Yhteensä: ${ostoskarry.sum()}")
            print("Maksu: ")
            val kateinen = readLine()!!.toInt()
            println("Vaihto: ${kateinen - ostoskarry.sum() }")
            break
        } else if (indeksi in 1..10) {
            val hinta = hinnat[indeksi-1]
            println("tuote: $indeksi Hinta: $hinta")
            ostoskarry.add(hinta)
        }
    }
}

