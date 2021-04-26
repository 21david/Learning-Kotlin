package udemy.kotlincourse.section04

import udemy.kotlincourse.javacode.DummyClass  // imported a Java class

// Video 28

fun main(args: Array<String>) {
    val myInt = 20
    val myLong1: Long = 22
    val myLong2 = 22L  // better way to do it

    /*
    A difference between Kotlin and Java
    This won't produce an error in Java:
        int myInt = 10;
        long myLong = myInt
    */

    /* In Kotlin, this would produce an error:
        var anInt = 30
        var aLong = 200L

        aLong = anInt
    */

    // In Kotlin, you need to convert using .toShort(), .toLong(), .toByte(), ..., methods
    var anInt = 30
    var aLong = 200L

    aLong = anInt.toLong()


    val myByte: Byte = 111
    var myShort: Short
    myShort = myByte.toShort()  // need to use the .toShort() method, unlike in Java

    val anotherInt = 5

    val myDouble = 65.5434  // Double is the default type for a decimal number, just like in Java
    println(myDouble is Double)

    println()

    // Same for Integer
    val intNum = 200777
    println(intNum is Int)


    // Unlike in Java, you can't assign integer values to chars in Kotlin
    // val char: Char = 65   <-- error

    val char1 = 'b'
    val char2: Char = 'c'
    val char3: Char = 65.toChar()

    val intForB: Int = 98

    println(char3)
    println(intForB.toChar())

    // Boolean can only be true or false
    val myBoolean: Boolean = true
    val myBoolean2: Boolean = false

    // Kotlin is inter-operable with Java
    // so we can import java code and use it
    // but since there is no primitives in Kotlin, how do we deal with
    // primitive data types in Java code that we use?

    val vacationTime = false

    // Make an instance of a Java class, and call its method that takes a primitive
    val onVacation = DummyClass().isVacationTime(vacationTime)  // it works as normal (gets converted to primitive)
    // it works as normal because Java has the automatic boxing/unboxing feature for primitive types
    println(onVacation)

    // Make an instance of a Java class, and call its method that takes a Boolean
    val onVacation2 = DummyClass().isVacationTime2(vacationTime)  // it works as normal
    println(onVacation2)

}