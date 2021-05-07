package udemy.kotlincourse.anotherpackage


// or import all of them

// import an individual thing from an enum

// import a top-level function from another file in another package
import udemy.kotlincourse.section05.CompanyCommunications
import udemy.kotlincourse.section05.Department.IT
import udemy.kotlincourse.section05.Department.SALES
import udemy.kotlincourse.section05.topLevelFunction

fun main(args: Array<String>) {
    topLevelFunction("lalala")

    // we can access an 'internal' function from another file in the same module
    // (we are in a different package, but in the same module)
    println(CompanyCommunications.getCopyrightLine())

    println(IT.getDeptInfo())
    println(SALES.getDeptInfo())
}