package udemy.kotlincourse.declarations

// type alises let us create shorter ways to use something (to reduce amount of code we write)
// create type aliases at the top, outside of classes
typealias EmployeeSet = Set<Employee>

// in IntelliJ, type 'main' and press enter for a shortcut
fun main(args: Array<String>) {
    // vals are immutable, and can only be assigned once, just like 'final' in Java
    val number = 25  // Kotlin makes this an Int automatically
    val number2: Int  // We make this an Int manually

    // If we want a short, we have to do it like this:
    val number3: Short = 25  // this is a case where we HAVE to provide the type

    // if we want to be able to reassign, we have to use var
    var numVar = 24
    numVar = 25
    numVar = 26

    // Kotlin recommends to use val whenever possible, and use var only when you need it
    // considered good practice to use val by default (unlike in Java)

    // we use the type alias for a Set<Employee>
    val employees: EmployeeSet

    val employee1 = Employee("Lynn Jones", 500)
    employee1.name = "Lynn Smith"

    val employee2: Employee
    val bigNumber = 100

    // even though employee2 is a val (final and immutable), the compiler can guarantee that
    // it will only be assigned once, so this won't give an error
    if(number < bigNumber) {
        employee2 = Employee("Jane Smith", 400)
    }
    else {
        employee2 = Employee("Mike Watson", 150)
    }

    // the type of a variable is fixed at instantiation, so you can't assign a string to an int variable
    // number = "hello"  <-- error

}

class Employee(var name: String, val id: Int) {

}