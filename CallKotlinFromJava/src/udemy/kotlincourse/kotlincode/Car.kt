// Video 82

@file:JvmName("StaticCar")

package udemy.kotlincourse.kotlincode

// in Kotlin, functions like these (top level functions) are put in a
// static class under-the-covers
// that class gets the same name as the Kotlin file with "Kt" at the end (this one would be CarKt)
// however, let's say we already have a "CarKt" class. We can rename it using
//       @file:JvmName("StaticCar")
// at the TOP of the file, before "package ..."
// now this function can be accessed as "StaticCar.topLevel();" from Java
fun topLevel() = println("I'm in the Car file.")

val testcapitalization = 200
val testCapitalization = 400

// val Testcapitalization = 600  // can't do this because of getter method clash with the other variable

// this annotation lets java access this without using "getLetJavaAccessWithoutModifier()"
@JvmField val letJavaAccessWithoutGetter = 4000

class CarKt(color: String, val model: String, @JvmField val year: Int) {
    var color: String = color
    set(value) {
        field = "always green"
    }
}

// can't have two variables with the same letters but different capitalization
// because then the JVM would generate the same getter and setter methods for both
// getA(), getModel(), and setModel(...) in this case
// class Test(val a: String, val A: String, var model: String, var Model: String) {}

// extension functions
fun String.printSpecial () {
    println(this + ", from a custom print() extension function for Strings.")
}