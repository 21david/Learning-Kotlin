// Video 60

package udemy.kotlincourse.section07

fun main(args: Array<String>) {
    run {
        println("I'm in a lambda!")
        println("Basic lambda syntax")
    }

    val employees = listOf(Employee("John", "Smith", 2012),
            Employee("Jane", "Wilson", 2015),
            Employee("Mary", "Johnson", 2010),
            Employee("Mike", "Jones", 2002))

    // this function finds the minimum start year
    // every start year gets assigned to 'e', and the lambda function
    // finds the minimum value (the employee w/ earliest startYear)
    println(employees.minBy( { e -> e.startYear } ))

    // parenthesis are optional when the lambda is the last parameters to be passed
    println(employees.minBy { e -> e.startYear })

    // the compiler can infer the type for e, but if it couldn't, we would
    // have to specify the type like this:
    println(employees.minBy { e: Employee -> e.startYear })

    // because there's only 1 argument, we can just use 'it' to refer to that argument
    println(employees.minBy { it.startYear })

    // the "double colon" syntax:
    // this code does the same as all the ones above
    // this says "find the minimum of all the start years, and return the employee
    // with that start year". Employee::startYear means "the startYear property
    // of the Employee class"
    println(employees.minBy(Employee::startYear))


    // lambdas can access variables, as long as they were declared above the lambda
    var num = 10
    run {
        num += 15
        println(num)
    }

    // this says "run the 'topLevel' function"
    // topLevel cannot have any parameters
    run(::topLevel)
}

fun useParameter(employees: List<Employee>, num: Int) {
    employees.forEach {
        println(it.firstName)
        println(num)
    }

}

fun topLevel() = println("I'm from a function.")

data class Employee(val firstName: String, val lastName: String, val startYear: Int) {}