fun main() {

    // The variables declared using "val" cannot be reasigned
    val integer: Int = 6
    val b1 = integer.toByte()

    val oneMillion = 1_000_000
    println("byte: $b1, inferedType: $oneMillion")

    // Variables declared using "var" can be reasigned

    var change_value = 100
    println("value before of change: $change_value")
    change_value = 200
    println("value changed: $change_value")

    // kotling has a "switch" statement, but is little different
    val day = 1

    when (day) {
        0 -> println("Its sunday")
        in 1..6 -> println("We are in the week")
        7 -> println("Its Saturday")
        else -> println("No match with a valid day")
    }

    // Kotling has support for null
    val canBeNull: Int? = null

    val cannotBeNull = canBeNull?.dec() ?: 100
    println("$cannotBeNull")

    val listOfNames = listOf("Dreck", "Julian", "Greicy")
    println(listOfNames)
    // listOfNames.remove("Dreck") // We cannot remove a inmutable list

    val mutableListOfDays =
            mutableListOf(
                    "Monday",
                    "Tuesday",
                    "Wendnesday",
                    "Thursday",
                    "Friday",
                    "Saturday",
                    "Sunday"
            )
    mutableListOfDays.remove("Sunday")

    val schools = arrayOf("shark", "salmon", "minnow")
    println(java.util.Arrays.toString(schools))

    // Creating array using a initial iterator function
    val array = Array(8) { it * 3 }
    println(java.util.Arrays.toString(array))

    // walk over iterators
    for (element in array) {
        print("$element ")
    }

    println()
    // repeat
    repeat(4) { println("We repeat this print 4 times") }

    for (index in 0..8 step 2) {
        print("$index |") // Print numbers over 2 times
    }
}
