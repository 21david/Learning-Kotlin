package udemy.kotlincourse.section06

fun main(args: Array<String>) {
    println(getNumber("22"))

    println("--------------------")

    println(getNumber("22.3"))

    println("--------------------")

    println(getNumberWithFinally("22"))

    println("--------------------")

    println(getNumberWithFinally("22.3"))

    println("--------------------")

    // try-catch is an expression, so you can use it with variables.
    // whatever it evaluates to is what gets assigned to the variable
    val numInQuotes1 = "200150"
    val numInQuotes2 = "199.99"

    val tryParsing1 = try {
            Integer.parseInt(numInQuotes1)
        }
        catch(ex: NumberFormatException) {
            -1
        }
        finally {
            println("Done")
        }

    println(tryParsing1)


    val tryParsing2 = try {
            Integer.parseInt(numInQuotes2)
        }
        catch(ex: NumberFormatException) {
            -1
        }
        finally {
            println("Done")
        }

    println(tryParsing2)

    println("--------------------")

    println(getNumberNullable("2000"))

    println("--------------------")

    val numString = "2000.1234"
    // Elvis operator
    println(getNumberNullable(numString)
            ?: getNumberNullable(numString.substring(0, numString.indexOf('.'))))

    println("--------------------")

    // Elvis operator can be used to throw an exception
   // println(getNumberNullable("22.4") ?: throw IllegalArgumentException("Number isn't an integer"))

    println("--------------------")

    // experimenting with Elvis operator
    println(null ?: "Null backup")
    println(getNumberNullable("0.99") ?: "I can't print the result")
    null ?: println("hi")
    null?:null?:null?:null?:println("wtF")

    println("--------------------")

    notImplementedYet("a stringity string")
}

fun notImplementedYet(something: String): Nothing {
    throw IllegalArgumentException("Implement me!")
}

fun getNumber(str: String): Int {
    //try-catch is an expression in Kotlin
    return try {
            println("Trying to parse the integer string..")
            Integer.parseInt(str)
        }
        catch(e: NumberFormatException) {
            println("Could not parse the integer string. Returning 0.")
            0
        }
}

fun getNumberWithFinally(str: String): Int {
    //try-catch is an expression in Kotlin
    return try {
        println("Trying to parse the integer string..")
        Integer.parseInt(str)
    }
    catch(e: NumberFormatException) {
        println("Could not parse the integer string. Returning 0.")
        0
    }
    finally {  // the finally block will never return something
        println("I'm in the finally block")
        -1  // although this gives no error, it will never be used
    }
}

// this one returns null instead of 0 if it cannot parse the string
fun getNumberNullable(str: String): Int? {
    return try {
        println("Trying to parse the integer string..")
        Integer.parseInt(str)
    }
    catch(e: NumberFormatException) {
        println("Could not parse the integer string. Returning null.")
        null
    }
}