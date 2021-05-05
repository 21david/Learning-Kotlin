// Challenges for section 7

package udemy.kotlincourse.challenges

fun main(args: Array<String>) {

    val joe = Person("Joe", "Jones", 45)
    val jane = Person("Jane", "Smith", 12)
    val mary = Person("Mary", "Wilson", 70)
    val john = Person("John", "Adams", 32)
    val jean = Person("Jean", "Smithson", 66)

    // one solution is to define component1(), component2(), ..., functions in Person
    // another solution is to make it a data class, because then we get them for free
    val (fName, lName, age) = joe
    println("first name = $fName, last name = $lName, age = $age")

}


class Person(val firstName: String, val lastName: String, val age: Int) {

    operator fun component1() = firstName
    operator fun component2() = lastName
    operator fun component3() = age

}


class Box<T> {


}

open class Paper {

}

class Regular: Paper() {

}

class Premium: Paper() {

}