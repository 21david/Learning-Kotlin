// Video 38

package udemy.kotlincourse.section05

// constants can be declared at the top level in Kotlin
// convention to use uppercase
val MY_CONSTANT = 100
val MAX_BYTE = 127  // 2^7 - 1
val MAX_SHORT = 32767  // 2^15 - 1
val MAX_INT = 2147483647  // 2^31 - 1

fun main(args: Array<String>) {
    println(MY_CONSTANT)

    println("$MAX_BYTE == ${Byte.MAX_VALUE}")
    println("$MAX_SHORT == ${Short.MAX_VALUE}")
    println("$MAX_INT == ${Int.MAX_VALUE}")
}