package udemy.kotlincourse.section3

// Video 23

// String templates are basically the syntax that looks like
// "Hello ${person.name}, your total balance due is $dollars dollars and $cents cents"

fun main(args: Array<String>) {
    val employee1 = Employee("Lynn Smith", 400)

    println(employee1) // use the toString() of Employee class


    val change = 4.22
    // Since Kotlin interprets $change as "show the value of change"
    // if we actually want to just print $change, we have to use \ to escape it
    println("To show the dollar sign, we may have to use escape it: \$change")

    // If there's 2 $s, then it knows the first one is just a $
    println("Your change is: $$change")


    // We can use string template syntax to evaluate and show expressions, not just variables
    // We need to use {} for this
    val numerator = 10.99
    val denominator = 20.00
    println("The value of $numerator divided by $denominator is ${numerator/denominator}")
    println("The value of 100 divided by 2000 is ${ division() }")

    println("The employee's ID is ${employee1.id}")
}

fun division(): Double {
    return 100.0 / 2000
}

class Employee(var name: String, val id: Int) {

    // override a method from the parent class
    override fun equals(obj: Any?): Boolean {
        if (obj is Employee)  // basically like 'instanceof' in Java
            return name == obj.name && id == obj.id

        return false
    }

    //override toString() method
    override fun toString(): String {
        return "Employee(name='$name', id=$id)"
    }

}