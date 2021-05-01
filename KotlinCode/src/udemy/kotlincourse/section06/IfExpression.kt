// Video 55

package udemy.kotlincourse.section06

fun main(args: Array<String>) {
    // expressions return a value
    // if is an expression in Kotlin

    var num: Int

    if(false)
        num = 50
    else
        num = 592

    println(num)

    var num2 = if(false) 50 else 592
    println(num2)

    println("------------")

    val someCondition = "david" == "dave"

    // if you use 'if' as an expression, then you NEED an 'else' with it
    // (what would num3 be assigned to if someCondition was false?)
    val num3 = if(someCondition) {
        println("david is the same as dave")
        39
    }
    else {
        println("david is not the same as dave!")
        437
    }

    println(num3)

    println("------------")

    // if, else if, else
    val number = 2
    val num4 =
        if(number == 1) {
            println("number was 1")
            "One"
        }
        else if(number == 2) {
            println("number was 2")
            "Two"
        }
        else if(number == 3) {
            println("number was 3")
            "Three"
        }
        else {
            println("number was greater than 3")
            "Four or greater"
        }
    println("num4 val is: $num4")


    println("------------")

    // checking if this produces error. It does not.
    if(true)
        50
    else
        100

    // also valid syntax:
    // the if expression gets evaluated within the ${}
    println("The result of the if expression is ${if( 4 == 4) {
        println("something")
        44
    }
    else {
        println("something else")
        73
    }}")


    println("------------")

    // this too is valid:
    // println returns Unit, so x becomes of type "Unit"
    val x = if(3 == 3)
        println("something")
    else
        println("something else")

    println(x.javaClass)

    println("------------")





}