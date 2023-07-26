import java.util.Random

fun main(args: Array<String>) {
    for (arg in args) {
        println("arg: $arg")
    }
    val randomDay = getRandomDay()
    println("radomDay: $randomDay")

    val decorations = listOf("rock", "pagoda", "plastic plant", "alligator", "flowerpot")
    println(decorations.filter { it[0] == 'p' })

    // lazy executed:
    val lazyMap =
            decorations.asSequence().map {
                println("access: $it")
                it
            }
    println("$lazyMap")
    println("first: ${lazyMap.first()}")
    println("all: , ${lazyMap.toList()}")

    val addNumberFn = closure()
    println("add: ${addNumberFn()}")
    println("add: ${addNumberFn()}")
    println("add: ${addNumberFn()}")
    println("add: ${addNumberFn()}")

    fun greet(name: String): String {
        return "Hello " + name
    }

    println("${sayAnything("Dreck Sallow",::greet)}")
}

fun getRandomDay(): String {

    val randomNumber = getRandomNumber(7)

    return when (randomNumber) {
        0 -> "Sunday"
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wendnesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        else -> "nothing"
    }
}

fun getRandomNumber(n: Int) = Random().nextInt(n)

fun closure(): () -> Int {
    var number = 0
    return { -> ++number }
}

fun sayAnything(name: String, greet: (String) -> String): String {
    return greet(name)
}
