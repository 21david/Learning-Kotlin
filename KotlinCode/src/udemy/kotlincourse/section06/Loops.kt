// Video 54

package udemy.kotlincourse.section06

fun main(args: Array<String>) {

    // the traditional for loop is gone in Kotlin:
    // for(var i = 0; i < 10; i++)  // error
    //     println(i)

    // Kotlin uses ranges now
    // Anything that is "comparable" can be used in a range
    val range = 1..5  // inclusive (this includes 1 and 5)
    for(i in range)
        print("$i ")
    println()

    val charRange = 'a'..'z'
    for(i in charRange)
        print("$i ")
    println()

    val strRange = "ABC".."XYZ"

    // use 'in' to check if something is inside a range
    println(4 in range)
    println('g' in charRange)
    println("DAV" in strRange)

    // this prints true because the string is < the last string in strRange
    // "CCCCCC" < "XYZ" (lexicographically)
    println("CCCCCC" in strRange)
    println("ZZZZZZ" in strRange)

    val backwardRange = 5.downTo(1)

    val stepRange = 3..15
    val stepThree = stepRange.step(3)  // get every 3rd position
    val reversedRange = range.reversed()  // reverse a range

    for(i in stepThree)
        print("$i ")
    println()

    for(i in reversedRange)
        print("$i ")
    println()

    // experiments *****
    for(i in (0..100).step(10))
        print("$i ")
    println()

    for(i in 0..100 step 10)
        print("$i ")
    println()

    for(i in (11..121).step(11).reversed())
        print("$i ")
    println()

    for(i in 121 downTo 11 step 11)
        print("$i ")
    println()
    // *******************

    // iterate through characters of a string
    val str = "Helloooo"
    for(c in str)
        print("$c ")
    println()

    for(i in 1 until 10)  // don't include 10
        print("$i ")
    println()

    val name = "david espinosa"
    val nameRange = 0..name.length-1
    for(c in nameRange)
        print("${name[c]} ")
    println(".")

    for(i in 0 until name.length)
        print("${name[i]} ")
    println(".")

    println("--------------------")

    val seasons = arrayOf("spring", "summer", "winter", "fall")

    val notASeason = "whatever" !in seasons
    println(notASeason)  // prints true

    val notInRange = 32 !in 1..10
    println(notInRange)  // prints true

    val greeting = "Hello"
    println('e' in greeting)  // prints true
    println('e' !in greeting)  // prints false

    println("--------------------")

    // instead of iterating through the actual strings
    // we can iterate through the indices (0 to (length - 1))
    for(index in seasons.indices)
        println("${seasons[index]} is season number ${index+1}")

    println("--------------------")
    
    // ******* forEach **********
    // we can do this too, using forEach
    seasons.forEachIndexed { index, season -> println("$season is season number ${index+1}") }



    println("--------------------")

    // you can name loops (like in Java)
    // syntax in Java is
    //      aSpecificLoop:
    //      [loop code ...]
    // and break/continue:
    //      break aSpecificLoop;
    //      continue aSpecificLoop;

    // syntax in Kotlin is
    //      aSpecificLoop@
    //      [loop code ...]
    // and break/continue:
    //      break@aSpecificLoop
    //      continue@aSpecificLoop
    for(i in 1..3) {
        println("i = $i")

        jLoop@
        for(j in 1..4) {
            println("  j = $j")
            for(k in 5..10) {
                println("    k = $k")
                if (k == 7)
                    break@jLoop
            }
        }
    }


}