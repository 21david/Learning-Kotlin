// Video 66

package udemy.kotlincourse.section07

fun main(args: Array<String>) {
    val setInts = setOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15)

    val odds = setInts.filter { it % 2 == 1 } // keep only ints where this expression evaluates to true
    println(odds)

    val immutableMap = mapOf<Int, Car>(1 to Car("green", "Toyota", 2015),
            2 to Car("red", "Ford", 2016),
            3 to Car("silver", "Honda", 2013),
            4 to Car("black", "Mercedes-Benz", 2007))

    // keep only cars from 2015 or more recent years
    // 'it' refers to the key-value pairs
    val newCars = immutableMap.filter { it.value.year >= 2015 }
    println(newCars)


    // filter() on a mutable collection:
    val mutableMap = mutableMapOf<Int, Car>(1 to Car("green", "Toyota", 2015),
            2 to Car("red", "Ford", 2016),
            3 to Car("silver", "Honda", 2013),
            4 to Car("black", "Mercedes-Benz", 2007))

    mutableMap.filter { it.value.color == "silver" || it.value.color == "black" }
    println(mutableMap) // the original map is left unchanged

    println("----------------")

    // arrays are collections in Kotlin
    val ints = arrayOf(1, 2, 3, 4, 5)
    val add10List: MutableList<Int> = mutableListOf()
    for(i in ints) {
        add10List.add(i+10)
    }
    println(add10List)

    // the same can be done with the map() function
    val add10List2 = ints.map {it + 10} // this returns an ArrayList
    println(add10List2)
    println(add10List2.javaClass)  // prints "class java.util.ArrayList"

    println("--------------------")

    // how to "extract" one of the properties
    val years = immutableMap.map { it.value.year }  // for each Car, just take the year and add it to the new collection
    println(years)

    // you can chain map() and filter()
    val manyCars = mutableMapOf<Int, Car>(
            1 to Car("green", "Toyota", 2015),
            2 to Car("red", "Ford", 2016),
            3 to Car("silver", "Honda", 2013),
            4 to Car("black", "Mercedes-Benz", 2007),
            17 to Car("red", "BMW", 2015),
            8 to Car("white", "BMW", 2020),
            21 to Car("black", "Mercedes-Benz", 2021),
            32 to Car("avatar blue", "Mercedes-Benz", 2030)
        )

    // get all the mercedes-benz, then get their colors, then remove duplicates
    // so basically, the colors we have for mercedes-benz cars
    println(manyCars.filter { it.value.model == "Mercedes-Benz"}
            .map { it.value.color }.distinct() )

    println("--------------------")

    // the all() function
    // this checks if all the objects in a collection match some boolean expression
    // returns true if all of them do, or false otherwise
    println(manyCars.all { it.value.year >= 2015 })  // prints false
    println(manyCars.all { it.value.year >= 2000 })  // prints true

    println("--------------------")

    // check if *any* of the cars match (so at least 1 car has to match)
    println(manyCars.any { it.value.year >= 2021 })  // prints true

    // count() - count how many cars match
    println(manyCars.count { it.value.year >= 2015 })  // prints 6 (6 cars in total)

    // get the values of a map
    val cars = manyCars.values
    // find only finds the first value that evaluates to true, then stops
    println(cars.find { it.year >= 2015 })  // prints the green Toyota from 2015 (the first car from left-to-right that is 2015 or more recent)


    // groupBy() -- group similar values together. returns a map.
    println( cars.groupBy { it.color })  // group the cars by their color
    println( cars.groupBy { it.model })  // group the cars by their model. this map has Strings as keys, and lists of Cars as values.

    println("-----------------------")

    // sort a map
    val manyCarsSorted = manyCars.toSortedMap()
    println(manyCarsSorted)  // sorted by key
    println(manyCarsSorted.javaClass)  // prints "class java.util.TreeMap"

    println(manyCars)  // not sorted

    println("-----------------------")

    // sortBy() -- sort something by a certain property
    println(cars.sortedBy { it.year }) // sort our cars by the year
    println(cars.sortedBy { it.model }) // sort by the model


}

