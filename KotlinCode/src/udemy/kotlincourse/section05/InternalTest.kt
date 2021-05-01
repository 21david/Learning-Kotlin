// Video 50

package udemy.kotlincourse.section05

import udemy.kotlincourse.anotherpackage.INT_MAX_VALUE
import udemy.kotlincourse.anotherpackage.Test2
import udemy.kotlincourse.anotherpackage.aRandomFunction2
import udemy.kotlincourse.anotherpackage.random_string

fun main(args: Array<String>) {
    val aTest = aRandomFunction("googoo gaga", 34)
    println(aTest)
    println("${aTest.str}, ${aTest.num}")


    // from another file in another package, but the same module
    // these still have to be imported though
    val anotherTest = aRandomFunction2("waa waa woo woo", 68)
    println(anotherTest)
    println("${anotherTest.str}, ${anotherTest.num}")

    println(random_string)
    println(INT_MAX_VALUE)

    val anotherTest2 = Test2("brrrrr", 42)
    println(anotherTest2)
    println(anotherTest2.str)
}

internal data class Test(internal val str: String, internal var num: Int) {

}

internal fun aRandomFunction(str: String, num: Int): Test {
    val aTest = Test(str, num)

    return aTest
}