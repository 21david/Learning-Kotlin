// Video 84
// Challenges for section 9

package udemy.kotlincourse.challenges

import udemy.kotlincourse.challenges.javacode.Employee

fun main(args: Array<String>) {
    // Challenge 1
    val employee = Employee("Jane", "Smith", 2000)

    employee.lastName = "Jones"
    employee.salaryLast3Years = arrayOf(50000.25f, 54000.60f, 56800.42f).toFloatArray() // or use floatArrayOf(50000.25f, ...)



}

