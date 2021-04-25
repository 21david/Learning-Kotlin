package udemy.kotlincourse.equality

// Video 21

fun main(args: Array<String>) {

    val employee1 = Employee("Mary", 1)
    val employee2 = Employee("John", 2)
    val employee3 = Employee("John", 2)

    println(employee1 == employee2)  // false
    println(employee2 == employee3)  // true
    println(employee1.equals(employee2))  // false
    println(employee2.equals(employee3))  // true

    println()

    // Very important difference between Kotlin and Java
    // the == operator looks for structural equality, not reference equality
    // == actually just uses .equals(), so the lines above all use .equals()

    // So how do we check for referential equality?
    // using the === operator
    // all 3 employees are different instantiations, so all expressions below result in false

    println(employee1 === employee2)  // false
    println(employee2 === employee3)  // false

    println()

    // if we make another variable that points to one of the existing employees
    // then === will result in true
    val employee4 = employee2
    println(employee4 === employee2)  // true

    println()

    println(employee4 != employee2)  // false (same contents)
    println(employee4 !== employee2)  // false (same references)
    println(employee2 != employee3)  // false (same contents)
    println(employee2 !== employee3)  // true (different references


    // So in Kotlin, you never really need the .equals() method
    // Use == to compare the contents of the objects
    // Use === to compare the references of the variables
}

class Employee(var name: String, val id: Int) {

    // override a method from the parent class
    override fun equals(obj: Any?): Boolean {
        if (obj is Employee)  // basically like 'instanceof' in Java
            return name == obj.name && id == obj.id

        return false
    }
}