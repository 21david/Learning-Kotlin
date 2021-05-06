// Video 80

package udemy.kotlincourse.section09

import udemy.kotlincourse.section09.javacode.Car

fun main(args: Array<String>) {
    val car: Car = Car("black", "mercedes-benz", 2007)  // we can create an object of Java type Car, just like that
    car.color = "shiny black"
    println(car)

    val nullableString = car.model  // nullableString becomes type "String?"

    // "platform types" use a ! in the type name (String! for example)
    // if you try to get a variable that is not annotated in the Java file,
    // it will return a ! type. For example, getColor() return type in Car.java is not annotated
    // so doing this gives us a "String!":
//  val color: Int = car.color

}

fun stringsTest() {
    // java strings vs kotlin strings

    val test1: kotlin.String = "kotlin string"
    val test2: java.lang.String = java.lang.String("java string")

    println("$test1 (${test1.javaClass}), $test2 (${test2.javaClass})")
}