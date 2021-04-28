// Video 32

package udemy.kotlincourse.section04

fun main(args: Array<String>) {
    // this will create an array containing 5 nulls
    val nullableInts = arrayOfNulls<Int>(5)
    for(i in nullableInts)
        print("$i ")
    println()

    println(nullableInts[3].toString())  // prints null

    // this works too, seems to be the same thing
    val nullableInts2 = arrayOfNulls<Int?>(5)
    for(i in nullableInts)
        print("$i ")
    println()
}