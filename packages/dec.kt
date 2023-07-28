package packages

data class Decoration(val rocks: String) {}

fun makeDecorations() {
    val dec1 = Decoration("granite")
    println(dec1)
    val dec2 = Decoration("slate")
    println(dec2)
    val dec3 = Decoration("slate")
    println(dec3)

    // Check equility
    println("dec1 === dec2 ${dec1.equals(dec2)}")
    println("dec2 === dec3 ${dec2.equals(dec3)}")

    val (rocks) = dec3
    println("rocks of decoration3: $rocks")
}

enum class Direction(val degress: Int) {
    NORTH(0),
    SOUTH(180),
    EAST(90),
    WEST(270)
}

fun makeDirections() {
    println(Direction.EAST.name)
    println(Direction.EAST.ordinal)
    println(Direction.EAST.degress)
}

sealed class Plant {}

class Rose : Plant() {}

class Tulip : Plant() {}

fun matchPlant(plant: Plant): String {
    return when (plant) {
        is Rose -> "Rose"
        is Tulip -> "Tulip"
    }
}
