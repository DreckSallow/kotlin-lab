package packages

fun main() {
    val person1 = Person()
    person1.greet()
    person1.name = "Javi"
    person1.age = 90
    person1.greet()

    // val pet1 = Pet(age = 3, name = "Fido")
    // pet1.greet()

    val pet2 = Pet(petName = "Max")
    pet2.greet()

    // println("Calling info pet outside greet method: ${pet2.info}")
    val car1 = CarVehicle("Ford", "Ford Mustang", 1985)
    println("${car1.getInfo()}")

    // Use classes created using Shape abstract class
    println("abstract triangle: ${Triangle(6.3,8.5).calculateArea()}")
    println("abstract square: ${Square(4.9).calculateArea()}")

    makeDecorations()
    makeDirections()
    println(matchPlant(Rose()))
}
