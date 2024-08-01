package luku9Luokat

fun main() {
    val car = Car()

    println("Starting the car")
    car.start()
    println("isOn = ${car.isOn}")

    println("Parking the car")
    car.stop()
    println("isOn = ${car.isOn}")

    val truck = Truck()
    println("New Truck arrived  ${truck.brand}, ${truck.model}, ${truck.fuelType},${Truck().color},${Truck().isOn}")
    truck.start()
    println("Test drive started ${truck.isOn}")
}
 open class Vehicle {
    var fuelType: String = ""
    var isOn = false;


    open fun start() {
        this.isOn = true
    }

    fun stop() {
        this.isOn = false
    }
}
class Car: Vehicle() {
    var brand: String = ""
    var model: String = ""
    var color: String = ""


}

class Truck: Vehicle() {
    var brand: String = "Toyota"
    var model: String = "Tacoma"
    var color: String = "Navy blue"
    init {
        fuelType = "Diesel"
    }
}