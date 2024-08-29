package luku13LoppuTehtavat

open class Employee(val id: Int, val name: String) {

}

fun main() {
   var allEmployees = mutableListOf<Employee>()
    var id = 1

    while (true) {
        print("Anna työntekijän nimi: (0 lopetus):")
        var employee = readln().toString();

        if (employee == "0") {
            break
        }

        val individualEmployee = Employee(id= id, name = employee)
        allEmployees.add(individualEmployee)
        id ++
    }
    allEmployees.forEach{
        println("id: ${it.id} Nimi: ${it.name}")
    }
}
