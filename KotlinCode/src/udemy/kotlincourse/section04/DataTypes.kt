package udemy.kotlincourse.section04

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
    // 6:58

}