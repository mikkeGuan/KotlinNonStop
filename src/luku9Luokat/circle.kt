package luku9Luokat

fun main() {

    val circle = Circle()

    circle.getArea()
    println("The area = ${circle.getArea()}")


}

//Inherits from the open Shape class in shapeApp.kt
class Circle: Shape() {
    var radius: Double = 0.0

    fun getArea(): Double{
        this.radius = 5.5
        val area: Double = radius * radius * 3.14159
       return area
    }
}



