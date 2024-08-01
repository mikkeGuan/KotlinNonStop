package luku9Luokat

open class Shape(xPos: Int = 0, yPos: Int = 0) {
    var xPos = 0
    var yPos = 0
    fun print() {
        println("Position: x=$xPos, y=$yPos")
    }
}
fun main() {
    Shape().print()


}