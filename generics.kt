import java.util.Random

fun main() {
    val stack1 = Stack(1, 2, 3, 4, 5, 6)
    println("last: ${stack1.pop()}, isEmpty: ${stack1.isEmpty()}")
    stackAdd(stack1)

    val shapesStack: Stack<Triangle> = Stack()
    println("Shape typeof : ${shapesStack.isOfType<Triangle>()}")
    println(Triangle("Triangle").isOfType<Square>())
}

class Stack<T>(vararg elements: T) {
    val inner: MutableList<T> = mutableListOf(*elements)

    fun push(el: T) {
        inner.add(el)
    }

    fun pop(): T? {
        return inner.removeLastOrNull()
    }

    fun isEmpty(): Boolean {
        return inner.isEmpty()
    }
}

fun stackAdd(stack: Stack<Int>) {
    stack.push(Random().nextInt(8))
}

// We use inline and refined to know to kotlin to check the types in runtime
inline fun <reified T : Shape> Stack<*>.isOfType() = inner is T

inline fun <reified T : Shape> Shape.isOfType() = this is T

open class Shape(open val nameShape: String) {}

class Triangle(override val nameShape: String) : Shape(nameShape)

class Square(override val nameShape: String) : Shape(nameShape)
