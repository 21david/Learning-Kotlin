// Video 75

package udemy.kotlincourse.section08

import java.io.File

// everything we do with IO in Kotlin is in the
// 'kotlin.io' package
// https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.io/

// Kotlin uses the JDK classes for IO

// The documentation tells us when we need to close something (for example, readText() tells us this)
// if it doesn't say we have to close something, then it means it closes it and we don't have to worry
// convention: if a function has 'use' in it's name, normally you don't have to worry about closing any resource

fun main(args: Array<String>) {
    val lines1 = File("dummy.txt").reader().readLines() // returns a list of strings, each element in the list is a line in the file
    lines1.forEach { println("@@ $it @@") }

    line()//-------------------------------------------------------

    val wholeFileAsAString = File("dummy.txt").reader().readText() // returns the whole file as a String. we have to close it after.
    println(wholeFileAsAString)  // file contains newlines, so we still see each line on its own line

    line()//-------------------------------------------------------

    val lines2 = File("dummy.txt").reader().use { it.readText() }  // 'use' closes the reader for us
    println(lines2)

    line()//-------------------------------------------------------

    val lines3 = File("dummy.txt").bufferedReader().use { it.readText() }  // 'use' closes the reader for us
    println(lines3)

    line()//-------------------------------------------------------

    val lines4 = File("dummy.txt").readText()
    println(lines4)

    line()//-------------------------------------------------------

    File("dummy.txt").reader().useLines { it.forEach{ println(it) } }

    line()//-------------------------------------------------------

    File("dummy.txt").reader().forEachLine { println(it) } // probably the best way to do it

}


fun line() = println("------------------------")