// Video 62

package udemy.kotlincourse.section07

fun main(args: Array<String>) {
    // there are mutable lists and immutable lists in Kotlin (like in Scala)
    val strings = listOf("spring", "summer", "fall", "winter")  // this creates an immutable list
    println(strings.javaClass)  // it is of type "java.util.Arrays$ArrayList"

    // create an empty list (2 ways)
    val emptyList1: List<String> = emptyList()
    val emptyList2 = emptyList<String>()

    var strings1 = listOf<String>()  // this creates an immutable list

    val notNullList = listOfNotNull("hello", null, "goodbye")  // basically filters out the nulls
    println(notNullList)

    // how to get a java.util.ArrayList
    val arraylist = arrayListOf(1, 2, 3, 4, 5, 6)  // this creates a mutable list
    println(arraylist.javaClass)  // this is of type "java.util.ArrayList"

    val mutableList = mutableListOf<Int>(1, 2, 3, 4, 7, 8, 9) // this creates a mutable list also
    println(mutableList.javaClass)  // this is of type "java.util.ArrayList"

    // if you use listOf(), you get an immutable list (java.util.Arrays$ArrayList)
    // if you use arrayListOf() or mutableListOf(), you get a mutable list (java.util.ArrayList)

    println("-----------------------")

    // convert an array to list
    val array = arrayOf("black", "white", "green")
    println(array)
    println(array.javaClass)  // prints "class [Ljava.lang.String;" (???)
    val colorList1 = listOf(*array)  // creates an immutable list
    println(colorList1)
    println(colorList1.javaClass)  // prints "class java.util.Arrays$ArrayList"
    val colorList2 = array.toList()  // turns it into a mutable list
    println(colorList2)
    println(colorList2.javaClass)  // prints "class java.util.ArrayList"
}