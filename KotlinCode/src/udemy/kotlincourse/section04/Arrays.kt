package udemy.kotlincourse.section04

// Video 29

fun main(args: Array<String>) {
    // 2 ways to create an arrays: with arrayOf() or with the Array constructor (Array())
    val names = arrayOf("John", "Jane", "Jill", "Joe")

    val longs1 = arrayOf(1L, 2L, 3L)
    val longs2 = arrayOf<Long>(1, 2, 3, 4, 5)

    val longsFailed = arrayOf(1, 2, 3, 4, 5, 6) // this actually makes a list of Ints

    println(longs1 is Array<Long>)
    println(longs2 is Array<Long>)
    println(longsFailed is Array<Int>)


    println(longs1[0])
    println(longs1[1])
    println(longs1[2])


    // Use Array constructors:
    // 16 means an array of 16 elements
    // { i -> i * i } means to fill the array with the square of each index
    val evenNumbers = Array(16) { i -> i * i }

    for(number in evenNumbers) {
        print("$number ")
    }
    println()

    // Make a really big array like [0, 1, 2, 3, ... ]
    val bigArray = Array(100000) { i -> i }
    println(java.util.Arrays.toString(bigArray))

    // Make an array full of 0s, or falses
    val allZeroes = Array(100) { 0 }
    println(java.util.Arrays.toString(allZeroes))

    val allFalse = Array(100) { false }
    println(java.util.Arrays.toString(allFalse))
}