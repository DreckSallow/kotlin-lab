package packages

abstract class Shape {
    abstract val typeShape: String
}

interface ShapeArea {
    fun calculateArea(): Double
}

class Triangle(var base: Double, var height: Double) : Shape(), ShapeArea {
    override val typeShape = "Triangle"

    override fun calculateArea(): Double {
        return (base * height) / 2
    }
}

class Square(var side: Double) : Shape(), ShapeArea {
    override val typeShape = "Square"
    override fun calculateArea(): Double {
        return side * side
    }
}

// When use interface ( by google):
// Use an interface if you have a lot of methods and one or two default implementations, for example
// as in AquariumAction below.

// when use abstract class (by google):
// Use an abstract class any time you can't complete a class.

interface ShapeColor {
    val color: String
}

// This is a class instanced one time. (Singleton)
object GoldShapeColor : ShapeColor {
    override val color = "gold"
}

class Rectangle(var base: Double, var height: Double) :
        Shape(), ShapeArea, ShapeColor by GoldShapeColor {
    override val typeShape = "Rectangle"
    override fun calculateArea(): Double {
        return base * height
    }
}
