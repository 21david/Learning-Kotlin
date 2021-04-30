package udemy.kotlincourse.anotherpackage


// or import all of them
import udemy.kotlincourse.section05.Department.*

// import an individual thing from an enum
import udemy.kotlincourse.section05.Department.IT

// import a top-level function from another file in another package
import udemy.kotlincourse.section05.topLevelFunction

fun main(args: Array<String>) {
    topLevelFunction("lalala")

    println(IT.getDeptInfo())
    println(SALES.getDeptInfo())
}