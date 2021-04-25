package udemy.kotlincourse.bitoperatorsandsmartcasting

// Video 22

fun main(args: Array<String>) {

    // Operators & and | don't exist in Kotlin
    // you have to spell them out

    val x = 0b0101  // binary number
    val y = 0b0111

    println(x and y)
    println(x or y)
    println(x xor y)
    println(Integer.toBinaryString(x and y))


    // Type casting in Kotlin
    val employee1 = Employee("Mary", 1)
    val employee2 = Employee("John", 2)
    val employee3 = Employee("John", 2)

    var something: Any = employee3  // Any is similar to Object in Java, "not exact" though

    if(something is Employee) {
        // In Java, casting would look like
        //    (Employee) something
        // In Kotlin:
        val newEmployee = something as Employee
        println(newEmployee.name)

        // However, Kotlin has "smart casting"
        // so since we checked "is Employee" above, Kotlin will smart cast
        val newEmployee2 = something  // no cast needed
        println(something.name)

        something = employee1
        println(something.name)  // no cast needed

        // only works if you don't reassign the variable to some other type
        something = "a string"
    //  println(something.name)  // error
    }

    something = "a string"
    // can use !is to check if its not of that certain type
    if(something !is Employee) {
        println("something is not an Employee")
    }
}

class Employee(var name: String, val id: Int) {

    // override a method from the parent class
    override fun equals(obj: Any?): Boolean {
        if (obj is Employee)  // basically like 'instanceof' in Java
            return name == obj.name && id == obj.id

        return false
    }
}