// Video 49


// althuogh Kotlin doesn't enforce that packages match directory structure,
// it is best practice
package udemy.kotlincourse.section05

// using 'as', we can rename imports (like in Python)
import udemy.kotlincourse.section05.CompanyCommunications as Comm

// we can rename functions that are imported
import udemy.kotlincourse.section05.topLevelFunction as tlf


fun main(args: Array<String>) {
    tlf("lalala")

    println(Comm.getCopyrightLine())
    println(Comm.getTagLine())
}