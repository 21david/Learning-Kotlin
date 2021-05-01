// Video 50

package udemy.kotlincourse.anotherpackage

import udemy.kotlincourse.section05.aRandomFunction

fun main(args: Array<String>) {
    val aTest = aRandomFunction("googoo gaga", 34)
    println(aTest)

    println("${aTest.str}, ${aTest.num}")
}

internal val INT_MAX_VALUE = 2147483647
internal var random_string = "wee ooo eee ooo"

internal data class Test2(internal val str: String, internal var num: Int) {

}

internal fun aRandomFunction2(str: String, num: Int): Test2 {
    val aTest = Test2(str, num)

    return aTest
}