// Video 68

package udemy.kotlincourse.section07

import java.math.BigDecimal

fun main(args: Array<String>) {
    // in Kotlin, unlike in Java, you have to provide type for the generics part
    val list: MutableList<String> = mutableListOf("Hello")
    list[0].toUpperCase()
    list += "Greetings"
    list += "Bonjour"

    val list2: List<String> = listOf("Gutentag", "Ni Hao")
    printCollectioStrings(list)
    printCollectioStrings(list2)

    val listOfInts1: List<Int> = listOf(50, 4, 19, 21, 30, 34, -4, 0, -20)
    val listOfInts2: MutableList<Int> = mutableListOf(1, -3, -4, -5, 0, 10, 20, 21, 30)

    val listOfBigDecimals1: List<BigDecimal> = listOf(BigDecimal(-20.999), BigDecimal(1000.005), BigDecimal(-0.000001))
    val listOfBigDecimals2: MutableList<BigDecimal> = mutableListOf(BigDecimal(21.888), BigDecimal(10.125), BigDecimal(3.14159))

    val listOfVehicles1: List<Vehicle> = listOf(Vehicle("black", "car", 30000.0), Vehicle("gray", "bike", 120.0))
    val listOfVehicles2: MutableList<Vehicle> = mutableListOf(Vehicle("red", "car", 52000.0), Vehicle("white", "bike", 99.99))


    line("Strings")
    printCollectionAnyType(list)
    printCollectionAnyType(list2)

    line("Ints")
    printCollectionAnyType(listOfInts1)
    printCollectionAnyType(listOfInts2)

    line("BigDecimals")
    printCollectionAnyType(listOfBigDecimals1)
    printCollectionAnyType(listOfBigDecimals2)

    line("Vehicles")
    printCollectionAnyType(listOfVehicles1)
    printCollectionAnyType(listOfVehicles2)

    line("Extension function")
    list.printCollectionExtension()
    listOfVehicles1.printCollectionExtension()

}


fun printCollectioStrings(collection: List<String>) {
    for(item in collection)
        println(item)
}

// T is the "type parameter declaration"
// so T can take the place of any type in Kotlin
fun <T> printCollectionAnyType(collection: List<T>) {
    for(item in collection)
        println(item)
}

// now as an extension function of the List class
// now this can be called on any object of type List (listExample.printCollectionExtension())
fun <T> List<T>.printCollectionExtension() {
    for(item in this)
        println(item)
}


data class Vehicle(val color: String, val type: String, val price: Double) {}

fun line(txt: String) = println("--- $txt -------------------")