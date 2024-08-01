package luku9Luokat

class TestPerson(){
    init {
        println("Introduction")
    }
    var firstName = "R"
    var lastName = "Guan"

    fun print() {
        println("Pesons name $firstName, $lastName")
    }
}
class Me(var age: Int = 0, var Height: Int = 0) {
    init {
        println("Object initialization")
    }
    fun printter() {
        println("Currently $age, $Height")
    }
    fun resetter() {
        age = 0
        Height = 0
    }
    fun move(x: Int, y: Int) {
        age = x
        Height = y
    }
}


fun main() {
    var person = TestPerson()
    person.print()



    person.firstName = "M"
    person.lastName = "Guan"

    val mikke = Me(22, 180)
    mikke.printter()
    mikke.move(23, 185)
    mikke.printter()
    /*
        person.print()
    */

}

