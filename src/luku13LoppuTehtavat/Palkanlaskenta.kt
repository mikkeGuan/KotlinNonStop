package luku13LoppuTehtavat


class SalaryEmployee(id: Int, name: String, val monthlySalary: Int) : Employee(id, name) {
    fun calculateSalary(): Int {
        return monthlySalary
    }
}

class PayrollSystem {
    fun calculatePayroll(employees: List<SalaryEmployee>) {
        println("Palkkalaskelma")
        println("==============")
        employees.forEachIndexed { index, employee ->

            val salary = employee.calculateSalary()
            println("Henkilölle: ${employee.id} - ${employee.name}")
            println("- Maksetaan: $salary")
            println()

            if (index != employees.size - 1) {
                println("Palkkalaskelma")
                println("==============")
            }
        }
    }
}

fun main() {
    val allEmployees = mutableListOf<SalaryEmployee>()
    var id = 1

    while (true) {
        print("Anna työntekijän nimi: (0 lopetus):")
        val employeeName = readLine()!!.toString()

        if (employeeName == "0") {
            break
        }

        print("Anna kuukausipalkka:")
        val monthlySalary = readLine()!!.toInt()

        val salaryEmployee = SalaryEmployee(id = id, name = employeeName, monthlySalary = monthlySalary)
        allEmployees.add(salaryEmployee)
        id++
    }

    if (allEmployees.isNotEmpty()) {
        val payrollSystem = PayrollSystem()
        payrollSystem.calculatePayroll(allEmployees)
    } else {
        println("Ei työntekijöitä, joita käsitellä.")
    }
}
