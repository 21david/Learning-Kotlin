// Video 61

package udemy.kotlincourse.section07

fun main(args: Array<String>) {
    val employees = listOf(Employee("John", "Smith", 2012),
            Employee("Jane", "Wilson", 2015),
            Employee("Mary", "Johnson", 2010),
            Employee("Mike", "Jones", 2002))

    findByLastName(employees, "Wilson")
    findByLastName(employees, "Smittywebermanjensen")

    println("----------------------")

    findByLastName2(employees, "Wilson")
    findByLastName2(employees, "Smittywebermanjensen")

    println("----------------------")

    findByLastName3(employees, "Wilson")
    findByLastName3(employees, "Smittywebermanjensen")

    println("----------------------")


    "Some String".apply someString@ {
        "Another String".apply {
            println(toLowerCase())  // uses "Another String"
            println(this@someString.toUpperCase())  // uses "Some String"
        }
    }
}

fun findByLastName(employees: List<Employee>, ln: String) {
    for(emp in employees) {
        if(emp.lastName == ln) {
            println("Yes, there's an employee w/ last name $ln")
            return
        }
    }

    println(("Nope, there's no employee w/ last name $ln"))
}

fun findByLastName2(employees: List<Employee>, ln: String) {
    // we can use forEach instead
    employees.forEach {
        if(it.lastName == ln) {
            println("Yes, there's an employee w/ last name $ln")

            // this returns out of both the lambda and the whole function
            // this is called a "non-local return"
            return
        }
    }

    println(("Nope, there's no employee w/ last name $ln"))
}

fun findByLastName3(employees: List<Employee>, ln: String) {
    // we can use forEach instead
    employees.forEach returnBlock@ {
        if(it.lastName == ln) {
            println("Yes, there's an employee w/ last name $ln")

            // this returns out of ONLY the lambda
            // this is called a "local return"
            return@returnBlock
        }
    }

    println(("The function continues anyways even if it found a last name"))
}