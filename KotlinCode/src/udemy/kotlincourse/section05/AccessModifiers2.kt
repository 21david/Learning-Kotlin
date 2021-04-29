// Video 37

package udemy.kotlincourse.section05

// top-level items are PUBLIC by default (everything can access)
// in Java, default is 'package private' (everything in the package can access)
fun main(args: Array<String>) {
    // four visibility modifiers in Kotlin
    // public, private, protected, and internal

    // internal is for modules
    // something marked as 'internal' can be seen from anywhere in the same module

    val emp = Employee("Buck")
    emp.fullTime = false
    println(emp.firstName)
    println(emp.fullTime)

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
class Employee(val firstName: String, fullTime: Boolean = true) {

    // how to write custom getters and setters:
    var fullTime = fullTime
    // Code like "employee.fullTime" will invoke this method
    get() {
        println("Running the custom get")
        return field  // field refers to the property its defining a get for - 'fullTime' in this case
    }
    // Code like "employee.fullTime = false" will invoke this method
    set(value) {
        println("Running the custom set")
        field = value
    }
}


class Demo {
    val dummy: String

    constructor() {
        dummy = "Hello"
    }
}