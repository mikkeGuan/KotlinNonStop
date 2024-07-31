package luku7Funktiot

fun main() {
    println( printGreeting("John"))
    println( printGreeting("John", "Johnson"))
}

fun printGreeting(firstName: String):String {
    return "Hello $firstName"
}

fun printGreeting(firstName: String, lastName:String):String {
    return "Hello $firstName $lastName"
}