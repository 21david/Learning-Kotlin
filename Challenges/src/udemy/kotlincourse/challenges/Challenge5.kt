// Video 74
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

    // challenge 2
    val immutableMap1: Map<String, Person> = mapOf(
            joe.lastName to joe,
            jane.lastName to jane,
            mary.lastName to mary,
            john.lastName to john,
            jean.lastName to jean
    )

    // challenge 3
    // count people who's last name starts with S
    println(immutableMap1.count { it.key[0] == 'S' })
    println(immutableMap1.count { (lastName, person) -> lastName[0] == 'S' })
    println(immutableMap1.count { (lastName, person) -> lastName.startsWith('S') })

    // Sarah's solution
    println(immutableMap1.filter { it.value.lastName.startsWith('S') }.count())


    // challenge 4
    // make a list of pairs of first names and last names, w/out using a loop
    println(immutableMap1.map { it.value.firstName }.zip(immutableMap1.keys))

    // Sarah's solutiond
    val namePairs = immutableMap1.map { Pair(it.value.firstName, it.value.lastName) }
    println(namePairs)

    val firstNames = immutableMap1.map { it.value.firstName }
    val lastNames = immutableMap1.map { it.value.lastName }
    val namePairs2 = firstNames.zip(lastNames)
    println(namePairs2)

    line()

    // challenge 5
    // use also() to print this:
    // Joe is 45 years old
    // Jane is 12 years old
    // ...
    immutableMap1.also { it.forEach {
        println("${it.value.firstName} is ${it.value.age} years old")
    } }

    line()

    immutableMap1.forEach { it.also {
        println("${it.value.firstName} is ${it.value.age} years old")
    } }

    line()

    // Sarah's solution
    immutableMap1.also {
        it.map { println("${it.value.firstName} is ${it.value.age} years old") }  // why use .map???
    }

    line()

    // challenge 6
    // make a list containing integers that appear in both list1 and list2
    val list1 = listOf(1, 4, 9, 15, 33)
    val list2 = listOf(4, 55, -83, 15, 22, 101)

    val isInBothLists = list1.intersect(list2)
    println(isInBothLists)

    // Sarah's solution
    val list3 = list1.filter { it in list2 } //we will keep every item in list1 that is also in list2
    println(list3)

    val list4 = list1.filter { list2.contains(it) }
    println(list4)


    // Challenge 7
    // solution is to make Box<T> covariant by adding 'out' to its declaration
    // class Box<out T> {}
    val regularPaper = Box<Regular>()
    var paper = Box<Paper>()
    paper = regularPaper

}

fun line() = println("-------------------------------")

class Person(val firstName: String, val lastName: String, val age: Int) {

    operator fun component1() = firstName
    operator fun component2() = lastName
    operator fun component3() = age

}

// because it's covariant, we can only "take papers" from the box, we can't add
// for example, if we have a Box of Regular papers, we shouldn't be able to add
// a Premium paper to the box (we would be mixing types, when the Box should only contain Regular papers)
class Box<out T> {

    // convariance contranints:
    // legal:
    fun takePaper(): T {}  // T is in the 'out' position

    // illegal:
//  fun addPaper(paper: T) {}  // T is in the 'in' position

}

open class Paper {}

class Regular: Paper() {}

class Premium: Paper() {}