package luku13LoppuTehtavat

open class Employee(id: Int = 1, name: String = " ") {

}

fun main() {
   var allEmployees = mutableListOf<Employee>()
    var id = 1

    while (true) {
        println("Anna työntekijän nimi: (0 lopetus):")
        var employee = readln().toString();

        if (employee == "0") {
            println(allEmployees)
            break
        }

        val individualEmployee = Employee(id= id, name = employee)
        allEmployees.add(individualEmployee)
        id ++
    }
    allEmployees.forEach{
        print({it}.toString())
    }
}
