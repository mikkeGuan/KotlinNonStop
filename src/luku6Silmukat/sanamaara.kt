package luku6Silmukat

fun main() {
    var sana = " "
    var lkm = 0
    println("Type a word (Type x to exit)")
    sana = readLine().toString()

    while (sana != "x ") {
        println("Type a word (Type x to exit)")
        sana = readLine().toString()
        lkm ++
        if (sana == "x"){
            println("You typed $lkm words")
            break
    }

    }

}