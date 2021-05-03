// Video 65

package udemy.kotlincourse.section07

fun main(args: Array<String>) {
    // mutable and immutable versions of sets, like maps and lists

    val setInts = setOf(1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5)
    println(setInts)

    // plus(), for an immutable set, returns a new set entirely
    val setInts2 = setInts.plus(6)
    val setInts3 = setInts2.plus(7)

    println(setInts3)

    // minus() is the same
    val setInts4 = setInts3.minus(2)
    val setInts5 = setInts4.minus(4)
    val setInts6 = setInts5.minus(100)  // if element isn't in set, nothing happens

    println(setInts5)

    // get the average of all the ints
    println(setInts6.average()) // prints a double

    // drop(n) drops the first n elements from the set
    val setInts7 = setInts6.drop(3) // works on all types of collections
    println(setInts7)


    val mutableSet = mutableSetOf(10, 10, 10, 20, 20, 20, 30, 30, 40, 50)
    mutableSet.plus(60)  // these functions don't change the original set (even if its mutable)
    mutableSet.plus(70)
    println(mutableSet)
}