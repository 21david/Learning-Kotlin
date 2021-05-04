package udemy.kotlincourse.section07.collectionsbraindump

import java.util.*

// reviewing everything I learned and experimenting with it
fun main(args: Array<String>) {
    // immutable collections can't receive new elements
    val immutableList: List<Int> = listOf(-20, -10, 0, 10, 20, 30, 40)

    // can't add (no methods available for it)
    // can't remove elements
    // can't set elements

    // toString() looks nice, is in the format [10, 20, ... ]
    println(immutableList)

    val immutableSet: Set<Int> = setOf(1, 1, 2, 2, 3, 3, 4, 4, 4, 4)

    // can't add
    // can't remove elements

    println(immutableSet)

    val immutableMap: Map<Int, String> = mapOf(
            1 to "One",
            2 to "Two",
            3 to "Three",
            4 to "Four"
        )

    // can't add elements
    //      immutableMap.put(5, "Five")  // give error "Unresolved reference: put"
    // can't change values
    //      immutableMap[2] = "Twoo"  // gives a similar error
    // can't remove elements
    immutableMap.minus(4) // this works, but it returns a new map, doesn't change the original

    // nicely formatted toString()
    // format (for <Int, String>) looks like {1=One, 2=Two, ... }
    println(immutableMap)

    // immutable collections are lame

    // the interfaces List<T>, Set<T>, and Map<T> are immutable
    // so they don't have the methods add, remove, etc.
    // (Ctrl+B while on their types to see source code)
    // Mutable classes implement these interfaces, then add methods
    // for adding, removing, etc.

    line()

    // using mutableListOf() is basically the equivalent to ArrayLists in Java!
    val mutableList: MutableList<Int> = mutableListOf(5, 4, 3, 2, 1, 0, 10, 9, 8, 7, 6)  // returns an ArrayList

    // can finally add, remove, set
    mutableList.add(5)  // add 5 to the end
    mutableList.add(4)
    mutableList += 3
    mutableList += 2
    mutableList += 1
    mutableList.addAll( java.util.Arrays.asList(0, 1, 2, 3, 4, 5) )  // add a whole collection to the end

    mutableList.add(6, 5) // add 5 at index 6
    mutableList.add(6, 4) // add 4 at index 6
    mutableList.add(6, 3) // add 3 at index 6
    mutableList.add(6, 2) // add 2 at index 6
    mutableList.add(6, 1) // add 1 at index 6

    mutableList.removeAt(11)  // remove the element at index 11
    mutableList.removeAt(11)
    mutableList.removeAt(11)
    mutableList.removeAt(11)
    mutableList.removeAt(11)
    mutableList.removeAt(11)

    mutableList.add(0, 6)  // add 6 at the beginning of the list
    mutableList.add(0, 7)
    mutableList.add(0, 8)
    mutableList.add(0, 9)
    mutableList.add(0, 10)

    mutableList.set(4, 4)  // set the element at index 4 to 4 (index, element)
    mutableList.set(3, 3)
    mutableList[2] = 2  // same exact thing:
    mutableList[1] = 1  // set the element at index 2 to 2 (mutableList[index] = element)
    mutableList[0] = 0

    val nums5to1 = listOf(5, 4, 3, 2, 1)
    mutableList.addAll(0, nums5to1)  // add that collection, starting at index 0 (basically append to the beginning)

    mutableList.remove(5)  // removes the first instance of 5
    mutableList.remove(4)  // removes the first instance of 4
    mutableList.removeAt(0)  // removes the first element
    mutableList.removeAt(0)
    mutableList.removeAt(0)
    mutableList -= 0  // removes the first instance of 0 (from left to right)
    mutableList -= 1  // removes the first instance of 1 (from left to right)
    mutableList -= 2
    mutableList -= 3
    mutableList -= 4

    println(mutableList) // nicely formatted toString()
    println(mutableList.javaClass)  // it is of type java.util.ArrayList

    line()

    // arrayListOf() seems to be the same as mutableListOf()
    // not quite sure what the difference is, if any
    val anArrayList: java.util.ArrayList<Int> = arrayListOf(0, 1, 2, 3, 4)
    val anArrayList2: ArrayList<Int> = arrayListOf(0, 1, 2, 3, 4)
    val anArrayList3: MutableList<Int> = arrayListOf(0, 1, 2, 3, 4)
    println(anArrayList.javaClass)  // prints "java.util.ArrayList"

    anArrayList.add(0, 1)
    anArrayList.add(0, 2)
    anArrayList.add(0, 3)

    anArrayList += 5
    anArrayList += 6

    anArrayList -= 3
    anArrayList -= 2
    anArrayList -= 1

    anArrayList.removeAt(0)

    anArrayList[4] = 3
    anArrayList[5] = 2

    anArrayList += 1

    println(anArrayList)

    anArrayList2.removeAt(0)
    anArrayList2.removeAt(0)
    println(anArrayList2)

    // can make an empty mutable list
    val emptyMutableList: MutableList<Int> = mutableListOf()
    println(emptyMutableList)

    line()

    // now mutable sets
    val mutableSet: MutableSet<Int> = mutableSetOf()
    println(mutableSet.javaClass)  // prints "java.util.LinkedHashSet"

    for (num in 11..11*11 step 11)
        mutableSet += num

    println(mutableSet)

    mutableSet.remove(121)  // removes 121
    mutableSet -= 110  // removes 110

    println(mutableSet)

    println("is empty? " + mutableSet.isEmpty())
    println("size: " + mutableSet.size)
    println("contains 88? " + mutableSet.contains(88))

    line()

    // now HashSet specifically (a mutable set)
    val aHashSet: HashSet<Int> = hashSetOf()
    val aHashSet2: MutableSet<Int> = hashSetOf()

    println(aHashSet.javaClass)
    println(aHashSet2.javaClass)

    for(num in 10..1000)
        aHashSet2 += num

    for(num in 200 until 300)
        aHashSet2 -= num

    println(aHashSet2)
    println("contains 10? ${aHashSet2.contains(10)}")
    println("contains 90? ${aHashSet2.contains(90)}")
    println("contains 210? ${aHashSet2.contains(210)}")
    println("contains 300? ${aHashSet2.contains(300)}")
    println("contains 1000? ${aHashSet2.contains(1000)}")
    println("size: ${aHashSet2.size}")

    line()

    // tree sets?
    val mutableTreeSet = mutableSet.toSortedSet()
    println( mutableTreeSet.javaClass)  // java.util.TreeSet
    println(mutableTreeSet is SortedSet)  // true
    println(mutableTreeSet is TreeSet)  // true

    mutableTreeSet += -5
    mutableTreeSet += -50
    mutableTreeSet += -15
    mutableTreeSet += 40
    mutableTreeSet += 300

    mutableTreeSet -= 66

    println(mutableTreeSet)
    println("size: ${mutableTreeSet.size}")
    println("contains 11? " + mutableTreeSet.contains(11))
    println("contains 1111? " + mutableTreeSet.contains(1111))

    line()

    // now mutable maps
    val mutableMap: MutableMap<String, Int> = mutableMapOf (
            "David" to 436,
            "Alex" to 677,
            "Jason" to 800,
            "Amalia" to 270,
            "Laura" to 1220,
            "Mark" to 4609
    )

    val emptyMutableMap: MutableMap<String, Int> = mutableMapOf()
    val sortedMutableMap: TreeMap<String, Int> = mutableMap.toSortedMap() as TreeMap<String, Int> // toSortedMap() gives SortedMap<K, V> but we can cast

    println(mutableMap.javaClass)  // both print "class java.util.LinkedHashMap"
    println(emptyMutableMap.javaClass)

    mutableMap.put("Andrea", 2101)
    mutableMap += "Jose" to 206
    mutableMap += "Monica" to 1566
    mutableMap += "Dummy Profile" to 1
    mutableMap += "Rosa" to 1289


    mutableMap.remove("Jason")
    mutableMap -= "Amalia"
    mutableMap -= "Alex"
    mutableMap -= "Laura"
    mutableMap -= "Jose"

    println(mutableMap)
    println(emptyMutableMap)

    println(mutableMap["David"])
    println("Andrea has ${mutableMap["Andrea"]} Facebook friends.")

    // iterate through a mutable map
    for(entry in mutableMap)
        print("${entry.key} has ${entry.value} friends, ")
    println()

    // use "destructuring"
    for((name, friends) in mutableMap)
        print("$name has $friends friends, ")
    println()

    println(mutableMap.getOrDefault("David", 0))
    println(mutableMap.getOrDefault("Bill", 0))

    line()

    // really quick, HashMaps
    val mutableHashMap: MutableMap<String, Int> = hashMapOf()
    val mutableHashMap2: HashMap<String, Int> = hashMapOf()

    mutableHashMap += "NASA" to 23436
    mutableHashMap += "Facebook" to 101300
    mutableHashMap += "ZipFall" to 39

    mutableHashMap -= "ZipFall"

    println("NASA has about ${mutableHashMap["NASA"]} employees")
    println("Facebook in the map? ${mutableHashMap.contains("Facebook")}" )
    println("Zoogle in the map? ${mutableHashMap.contains("Zoogle")}")

    // get key set and value set
    val keySet: MutableSet<String> = mutableHashMap.keys
    val valueSet: MutableCollection<Int> = mutableHashMap.values

    println(keySet)
    println(valueSet)

    line()

    //now i'm just gonna try random stuff

    println(mutableSet + immutableSet)
    println(mutableTreeSet + immutableSet + mutableMap.keys)

    println(mutableSet.drop(2))
    println(mutableList.drop(3))

    println(mutableMap + immutableMap)

    // we can mix Map<String, Int> with Map<Int, String>
    println((mutableMap + immutableMap) is Map<Any, Any>) // prints true

    val testToSet = mutableList.toSet()
    println(testToSet)
    println(testToSet is MutableSet) // prints true
    println(testToSet.javaClass)  // java.util.LinkedHashSet

    println(mutableList.all { it >= 0 })  // true
    println(mutableList.any { it >= 6 })  // false
    println(mutableList.count { it == 4 }) // there are four 4s
    println(mutableList.groupBy { it })  // group all the same numbers together into groups
    println(mutableList.map { -it })  // turn all numbers into their negative version (except 0)
    println(mutableList.filter { it in 1..4 })  // keep all elements in the range [1, 4]

    mutableList.sort()
    println(mutableList)

    val stringsSet = mutableSetOf("David", "Kayla", "Alex", "Sydney", "Ale", "Andrea", "Zoe", "Bronthie")
    println(stringsSet.sortedBy { it[1] })  // sort by second letter
    println(stringsSet.sortedBy { it[it.length - 1] }) // sorted by last letter

    // iterating through these lists with for loop
    for(elem in mutableList)
        print("$elem ")
    println()

    val listOfStrings: List<String> = stringsSet.toList()  // convert a set to a list
    println(listOfStrings.javaClass)  // java.util.ArrayList

    // iterate but with the indices
    for(index in listOfStrings.indices)
        print("($index: ${listOfStrings[index]}) ")
    println()

    // copy the toString() format of lists, sets, maps
    // using for loop
    print("[")
    for(i in 0 until listOfStrings.size-1)
        print("${listOfStrings[i]}, ")
    println(listOfStrings[listOfStrings.size-1] + "]" + " <-- with for loop")

    // now with while loop
    print("[")
    var i = 0
    while(i < listOfStrings.size-1) {
        print("${listOfStrings[i]}, ")
        i++
    }
    println(listOfStrings[listOfStrings.size-1] + "]" + " <-- with while loop")

    // now with StringBuilder and forEach()
    var output: StringBuilder = StringBuilder("[")
    listOfStrings.forEach {
        output.append(it)
        output.append(", ")
    }
    output.append("\b\b]")  // remove the last ", " (an extra comma and space), and add the ]
    println(output.toString() + " <-- with forEach() (and StringBuilder)")

    // now with with() and forEach()
    var output2: StringBuilder = StringBuilder("[")
    with(output2) {
        listOfStrings.forEach { append("$it, ") }
        append("\b\b]")
    }
    println(output2.toString() + " <-- with with() and forEach()")

    // now with apply() and forEach()
    var output3: StringBuilder = StringBuilder("[")
    output3.apply {
        listOfStrings.forEach { append("$it, ") }
        append("\b\b]")
    }
    println(output3.toString() + " <-- with apply() and forEach()")

    println(listOfStrings.toString() + " <-- original")

    println(listOfStrings.asReversed())

    /*
    So many different types:
        Lists:
            List<T>
            java.util.Arrays$ArrayList
            ArrayList<T>
            MutableList<T>
        Sets:
            Set<T>
            MutableSet<T>
            LinkedHashSet<T>
            HashSet<T>
            SortedSet<T>
            TreeSet<T>
        Maps:
            Map<K, V>
            MutableMap<K, V>
            LinkedHashMap<K, V>
            HashMap<K, V>
            SortedMap<K, V>
            TreeMap<K, V>
     */

    val set: Set<Int> = setOf(1, 2, 3)
    val set2: MutableSet<Int> = mutableSetOf(1, 2, 3)  // i think it actually returns a LinkedHashSet<Int> type object (so you can probably cast)
    val set2b: LinkedHashSet<Int> = set2 as LinkedHashSet<Int>
    val set3: SortedSet<Int> = set2.toSortedSet()  // i think it actually returns a TreeSet<Int> type object
    val set3b: TreeSet<Int> = set3 as TreeSet<Int>
    val set4: HashSet<Int> = hashSetOf(1, 2, 3, 4, 5)

    val map: Map<String, Int> = mapOf("Joseph" to 5, "Maria" to 20, "Buck" to 45)
    val map2: MutableMap<String, Int> = mutableMapOf("Joseph" to 5, "Maria" to 20, "Buck" to 45)
    // ...

    /*
    In conclusion, my favorite data structures are:
    MutableList<T> / ArrayList<T>  <--  mutableListOf() / arrayListOf()
    MutableSet<T> / LinkedHashSet<T>  <--  mutableSetOf()
    HashSet<T> <-- hashSetOf()
    MutableMap<K, V> / LinkedHashMap<K, V>  <--  mutableMapOf()
    HashMap<K, V> <-- hashMapOf()
    TreeSet<T> / SortedSet<T> <-- mutableSetOf(...).toSortedSet()  (may need to cast with "as TreeSet<T>")
    TreeMap<K, V> / SortedMap<K, V> <-- mutableMapOf(...).toSortedMap()  (may need to cast with "as TreeMap<K, V>")

    I will probably be using
        mutableListOf(), mutableSetOf(), hashSetOf(), mutableMapOf(),
        and hashMapOf() 
    most of the time
    */
}

fun line() = println("---------------------")