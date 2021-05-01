// Video 56

package udemy.kotlincourse.section06

import java.math.BigDecimal

fun main(args: Array<String>) {
    var num = 200

    // this is the equivalent for "switch" in Java
    // unlike in Java, we don't need the 'break' keyword to stop the when block
    // it automatically stops after it finishes the code for a case (or reaches the 'else' case)
    // therefore, we lose the ability for the code to "drop through" to the next case until
    // it finds a 'break'. There is no way to do that in Kotlin.
    when(num) {
        100 -> println("100")
        200 -> println("200")  // this one prints
        300 -> println("300")
        else -> println("doesn't match anything")
    }


    // we can mash cases together
    // so it it matches either case, it will run the code for that case
    num = 600
    when(num) {
        100, 600 -> println("600")  // this one prints
        200 -> println("200")
        300 -> println("300")
        else -> println("doesn't match anything")
    }


    // we can use ranges
    num = 172
    when(num) {
        in 100..199 -> println("in range [100, 199]")  // this one prints
        200 -> println("200")
        300 -> println("300")
        else -> println("doesn't match anything")
    }


    // you can put expressions as the cases
    num = 90
    val y = 10
    when(num) {
        y + 80 -> println("90")  // this one prints
        y + 90 -> println("100")
        300 -> println("300")
        else -> println("doesn't match anything")
    }


    val obj1: Any = "I'm a string"
    val obj2: Any = BigDecimal(42000.2334)
    val obj3: Any = 45
    val obj4: Any = arrayOf('a', 'b', 'c', 'd', 'e')

    // smart casting using if statements
    var something: Any = obj2
    if(something is String)
        println(something.toUpperCase())
    else if(something is BigDecimal)
        println(something.remainder(BigDecimal(10.5)))  // prints 0.23339999999734573066234588623046875
    else if(something is Int)
        println("${something - 22}")

    // smart casting using when
    when(something) {
        is String -> println(something.toUpperCase())
        is BigDecimal -> println(something.remainder(BigDecimal(1.5)))  // prints 0.23339999999734573066234588623046875
        is Int -> println("${something - 22}")
    }


    // when is an expression, so we can assign it to variables
    // (meaning, we assign whatever it resolves to to a variable)
    // however, to use it to initialize a variable, you need an 'else' to cover all possible cases
    val z = when(something) {
        is String -> println(something.toUpperCase())
        is BigDecimal -> println(something.remainder(BigDecimal(1.5)))  // prints 0.23339999999734573066234588623046875
        is Int -> println("${something - 22}")
        else -> println("No idea what type this is")
    }

    println(z)  // prints kotlin.Unit

    // this would be a more sense-ful way to use when as an expression:
    something = "this is now a string"
    val z2 = when(something) {
        is String -> something.toUpperCase()
        is BigDecimal -> something.remainder(BigDecimal(1.5))
        is Int -> something - 22
        else -> "No idea what type this is"
    }

    println(z2)  // prints THIS IS NOW A STRING


}