// Video 63

package udemy.kotlincourse.section07

fun main(args: Array<String>) {
    val strings = listOf("spring", "summer", "fall", "winter")
    val colorList = listOf("black", "blue", "white", "red", "green")

    // convert an immutable list to a mutable list
    val mutableSeasons = strings.toMutableList()
    mutableSeasons.add("summer 2.0")
    println(mutableSeasons)

    // get the last element
    println(strings.last())

    // reverse a list
    println(strings.asReversed())

    // get an item at an index that may be out of bounds
    println(strings.getOrNull(5))  // 5 is out of bounds, so this prints "null"

    // easy way to get the max value of a collection
    val ints = listOf(10, 5, -4, 3, 0, -9, -5, 4, 30, 2, 5, 9, 13, -3)
    println(ints.max())

    // the zip() function
    // it creates "pairs" (kotlin.Pair)
    println(colorList.zip(strings))
    println(colorList.zip(strings)[0].javaClass)


    val mergedLists = colorList + strings
    println(mergedLists)

    val hasDuplicates = listOf("blue", "red", "green", "blue", "black", "red", "green")
    // union() combines two lists, but removes duplicates (in both lists)
    val noDupsList = hasDuplicates.union(strings)
    println(noDupsList)


    // remove duplicates
    println(hasDuplicates.distinct())
}