// Video 67

package udemy.kotlincourse.section07

import udemy.kotlincourse.section07.collectionsbraindump.line

fun main(args: Array<String>) {
    // Sequences are good for bigger data sets
    // pretty much the same as "Streams" in Java (introduced in Java 8)

    // instead of chaining function calls together, like .filter{...}.map{...},
    // which creates intermediate collections,
    // Sequences work on the elements one by one, so that no intermediate sequences are created

    // You only want to do this for large collections

    val manyCars = mutableMapOf<Int, Car>(
            1 to Car("green", "Toyota", 2015),
            2 to Car("red", "Ford", 2016),
            3 to Car("silver", "Honda", 2013),
            4 to Car("black", "Mercedes-Benz", 2007),
            17 to Car("red", "BMW", 2015),
            8 to Car("white", "BMW", 2020),
            9 to Car("green", "Ford", 2010),
            21 to Car("black", "Mercedes-Benz", 2021),
            32 to Car("avatar blue", "Mercedes-Benz", 2030)
    )

    // example of doing it the regular way
    // get the colors of the Fords
    println(manyCars.filter{ (key, value) -> value.model == "Ford" }.map { (key, value) -> value.color })


    // example of using sequences
    // each value will be evaluated one by one, there won't be intermediate collections
    println(manyCars.asSequence().filter{ (key, value) -> value.model == "Ford" }.map { (key, value) -> value.color })

    line()

    // Sequences are "lazily evaluated", so they don't always operate
    // the following code does not run:
    // it doesn't run because it doesn't have a "terminal operation"
    listOf("Joe", "Mary", "Jane").asSequence()
            .filter { println("filtering $it"); it[0] == 'J' }  // filter returns a Sequence
            .map{ println("mapping $it"); it.toUpperCase() }  // map returns a Sequence

    line()

    // this code executes because it has a terminal operation
    // now the println statements will show
    listOf("Joe", "Mary", "Jane").asSequence()
            .filter { println("filtering $it"); it[0] == 'J' }
            .map{ println("mapping $it"); it.toUpperCase() }
            .toList()  // toList() is a terminal operation, it returns a list


    line()

    // in this scenario, the first element matches the 'find' boolean expression
    // so since it finds it right off the bat, nothing else needs to execute
    // and a lot of execution is pruned off (a lot less work is done for the same result)
    listOf("Joe", "Mary", "Jane").asSequence()
            .filter { println("filtering $it"); it[0] == 'J' }
            .map{ println("mapping $it"); it.toUpperCase() }
            .find { it.endsWith('E') }  // toList() is a terminal operation, it returns a list

    // without 'asSequence' in the above code, the whole list is filtered, then the whole result
    // is mapped, and THEN find is ran on the result of that

    // also, order of functions matter. Since we did 'filter' first, our 'map' does work on a smaller
    // list. If done the other way around, we do more work. This would be bad for much larger sets of data.

    line()
}