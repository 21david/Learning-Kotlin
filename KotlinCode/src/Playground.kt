


fun main(args: Array<String>) {
    val function = fun() { println("Hellooooo") }

    println(function.javaClass)  // prints "class PlaygroundKt$main$function$1"


    val listOfFunctions = mutableListOf(function)

    // create 6 functions and add to the list
    for(i in 0..6) {
        val newFunc = fun() {
            println(i)
        }

        listOfFunctions.add(newFunc)
    }

    // what does each function print?
    for(func in listOfFunctions) {
        func()
    }


    println("----------------------")

    // each one prints the number it was assigned to print
    listOfFunctions[0]()  // prints "Hellooooo"
    listOfFunctions[1]()  // prints "0"
    listOfFunctions[2]()  // prints "1"
    listOfFunctions[3]()  // prints "2"


    println("----------------------")

    val hiDavid = createAFunction("Morning", "david")
    val hiSuzanne = createAFunction("EVENING", "Suzanne")
    val hiPeterson = createAFunction("night", "peterson")
    val hiMimo = createAFunction("dawn", "Mimo")

    hiDavid()
    hiSuzanne()
    hiPeterson()
    hiMimo()


}

fun createAFunction(timeOfDay: String, name: String): (() -> Unit) {
    val greeting = when(timeOfDay.toLowerCase()) {
        "morning" -> "Good morning to you,"
        "noon" -> "Good day to you,"
        "evening" -> "Hope you are having a good evening,"
        "night" -> "I hope you had a great day,"
        else -> "Hello there,"
    }

    val fixedName: String
    if(name[0].isLowerCase())
        fixedName = name[0].toUpperCase() + name.substring(1)
    else
        fixedName = name

    return fun(): Unit {
        println("$greeting $fixedName!")
    }
}