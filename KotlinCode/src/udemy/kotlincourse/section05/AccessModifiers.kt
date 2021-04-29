// Video 36

package udemy.kotlincourse.section05

// top-level items are PUBLIC by default
// in Java, default is 'package private' (everything in the package can access)
fun main(args: Array<String>) {
    // four visibility modifiers in Kotlin
    // public, private, protected, and internal

    // internal is for modules
    // something marked as 'internal' can be seen from anywhere in the same module

    val emp = Employee("Buck")
    println(emp.firstName)

    val emp2 = Employee("Samantha")
    println(emp2.firstName)
    println(emp2.fullTime)

    val emp3 = Employee("Jane", false)
    println(emp3.firstName)
    println(emp3.fullTime)


}

// no matching requirement between file name and class names
// so you can have as many public classes as you want in Kotlin

// in Kotlin, you can have a private class (unlike in Java)

// this class is visible ONLY to this file
private class Example {

}

// this class has a 'primary constructor' since it is defined
// in the same line as the class name
class Employee(val firstName: String, var fullTime: Boolean = true) {
}


class Demo {
    val dummy: String

    constructor() {
        dummy = "Hello"
    }
}