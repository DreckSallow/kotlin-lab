package packages

class Person {
    var name: String = "Dreck"
    var age: Int = 20
    fun greet() {
        println("Hello I'm $name, and I'm $age years old")
    }
}

class Pet(val name: String, var age: Int) {

    val info: String
        get() = "petName: $name, petAge: $age"

    init {
        println("Creating a pet with: $name, $age")
    }

    constructor(petName: String) : this(petName, 0) {
        age = petName.length
    }
    fun greet() {
        println("Hello I'm a pet. Info: $info")
    }
}

// You must mark a class as open to allow it to be subclassed
open class Vehicle(
        open var brand: String,
        open var model: String,
        open var yearOfProduction: Int,
        open var wheelCount: Int
) {
    open fun getInfo(): String {
        return "brand: $brand, model: $model, yearOfProduction: $yearOfProduction, wheels: $wheelCount"
    }
}

class CarVehicle(
        override var brand: String,
        override var model: String,
        override var yearOfProduction: Int,
) : Vehicle(brand, model, yearOfProduction, 4) {}
