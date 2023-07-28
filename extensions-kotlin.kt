import java.util.Random

fun main() {
    val fullName = "Dreck" to " Sallow"
    println("${fullName.first} ${fullName.second}")

    val (firstName, lastName) = fullName
    println("FirstName: $firstName, lastName: $lastName")

    val numbers = Triple(6, 9, 12)
    println(numbers.toString())
    println(numbers.toList())

    val names = hashMapOf("D" to "Dreck", "L" to "Lil")
    println("${names.get("L")} ${names["D"]}")
    // extensions:
    println("2 < 5?: ${2.isLessThan5()}")
}

val n = getNumber()

// "const val" is only use with compile time variables
// const val nNot = getNumber()
fun getNumber() = Random().nextInt()

// We can also use "const val" inside singleton classes
object NAMES {
    const val DRECK = "DRECK"
    const val JOSHE = "JOSHE"
}

// If you need to declare constants inside a class
class MyClass {
    companion object {
        const val CLASS_INSTANCE = "CONSTANT"
    }
}

// Extendind funcionality

fun Int.isLessThan5() = this < 5
