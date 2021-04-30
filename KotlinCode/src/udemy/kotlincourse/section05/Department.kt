// Video 48

package udemy.kotlincourse.section05

fun main(args: Array<String>) {
    println(Department.ACCOUNTING.getDeptInfo())
}

enum class Department(val fullName: String, val numEmployees: Int) {
    HR("Human Resources", 5), IT("Information Technology", 10),
    ACCOUNTING("Accounting", 3), SALES("Sales", 20);  // need a semicolon if functions are added

    fun getDeptInfo() = "The $fullName department has $numEmployees employees."
}