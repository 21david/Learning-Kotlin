package udemy.kotlincourse.section04

import udemy.kotlincourse.javacode.DummyClass
import java.math.BigDecimal
import java.util.*

// Video 29

fun main(args: Array<String>) {
    // 2 ways to create an arrays: with arrayOf() or with the Array constructor (Array())

    // this is basically equivalent to
    //      String[] names = {"John", ... };
    val names = arrayOf("John", "Jane", "Jill", "Joe")

    val longs1 = arrayOf(1L, 2L, 3L)
    val longs2 = arrayOf<Long>(1, 2, 3, 4, 5)
    // basically
    //     long[] longs1 = {1, 2, 3};
    //     long[] longs2 = {1, 2, 3, 4, 5};

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

    // Make a really big array with natural numbers like [0, 1, 2, 3, ... ]
    val bigArray = Array(100000) { i -> i }
    println(java.util.Arrays.toString(bigArray))

    // Make an array full of 0s, or falses
    val allZeroes = Array(100) { 0 }
    println(java.util.Arrays.toString(allZeroes))

    val allFalse = Array(100) { false }
    println(java.util.Arrays.toString(allFalse))


    var someArray: Array<Int>
    someArray = arrayOf(1, 2, 3, 4)
    for(number in someArray)
        print("$number ")

    println()

    someArray = Array(6) { i -> (i + 1) * 10}
    for(number in someArray)
        print("$number ")

    println()

    // We can have an array with mixed types: Strings, Ints, Booleans, etc.
    val mixedArray = arrayOf("hello", 22, BigDecimal(10.5), 'a', false)
    for(element in mixedArray)
        print("$element  ")
    println()

    println(mixedArray is Array<Any>)  // true


    // In DummyClass.java, we have a method that expects an 'int[]' variable
    // unlike with primitive types like 'boolean', it won't automatically convert (with boxing/unboxing)
    // we have to use a method intArrayOf() to create an under-the-cover 'int[]' variable (array of ints)
    // she said this gives a performance boost too, so use it even if you don't actually need an 'int[]' type
    val myIntArray = intArrayOf(3, 9, 54, 32, 0, 21)
    DummyClass().printNumbers(myIntArray)  // this method expects an int[], and it gets one

    // Using IntArray(), we can specify only an initial size, and the elements will be
    // initialized to 0 by default (because they are integers)
    var someOtherArray = IntArray(5)
    println(Arrays.toString(someOtherArray))


    // You can convert an Array<Int> to an int[]
    // use toIntArray()
    val array: Array<Int> = arrayOf(20, 43, 12, 3, 9, 15, 37, 65, 69)
    DummyClass().printNumbers(array.toIntArray())


    // You can convert an int[] to an Array<Int> as well
    // use toTypedArray()
    // I guess int[] in Kotlin is technically IntArray
    val anIntArray: IntArray = intArrayOf(12, 43, 21, 0, 3, 12, 4, 5)
    val convertedIntArray: Array<Int> = myIntArray.toTypedArray()
}

