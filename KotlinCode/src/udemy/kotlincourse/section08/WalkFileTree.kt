package udemy.kotlincourse.section08

import java.io.File

fun main(args: Array<String>) {
    // "." starts us at our current directory (working directory)
//    File(".").walkTopDown().forEach { println(it) } // 'it' will be each file in the tree

    // Print only Kotlin files
    File(".").walkTopDown()  // this will return a sequence
            .filter { it.name.endsWith(".kt") } // filter will also return a sequence
            .forEach { println(it.name) }
}