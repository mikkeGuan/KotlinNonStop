package luku8Debuggaus

fun main(args: Array<String>) {
    var nums = arrayOf(1, 2, 3, 4, 5, 6)

    for (i in 1..nums.size) {
        var x = i * 10
        println("Num = $i")
    }

    println("The end")
}