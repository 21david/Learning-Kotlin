// Video 64

package udemy.kotlincourse.section07

fun main(args: Array<String>) {
    // can have mutable or immutable maps

    val immutableMap = mapOf<Int, Car>(1 to Car("green", "Toyota", 2015),
            2 to Car("red", "Ford", 2016),
            3 to Car("silver", "Honda", 2013),
            4 to Car("black", "Mercedes-Benz", 2007))

    println(immutableMap)  // prints the key-value pairs
    println(immutableMap.javaClass)  // prints "class java.util.LinkedHashMap"

    val mutableMap = mutableMapOf<String, Car>("John's car" to Car("red", "Range Rover", 2010),
            "Jane's car" to Car("blue", "Hyundai", 2012),
            "my car" to Car("black", "Mercedes-Benz", 2007))

    println(mutableMap)
    println(mutableMap.javaClass) // prints "class java.util.LinkedHashMap"

    // if you want a java.util.HashMap
    val hashMap = hashMapOf<String, Car>("John's car" to Car("red", "Range Rover", 2010),
            "Jane's car" to Car("blue", "Hyundai", 2012),
            "my car" to Car("black", "Mercedes-Benz", 2007))

    println(hashMap)
    println(hashMap.javaClass) // prints "class java.util.HashMap"

    // hashMap is mutable
    hashMap.put("Mary's car", Car("red", "Corvette", 1965))

    // Pairs
    val pair = Pair(10, "ten")
    val firstVal = pair.first
    val secondVal = pair.second

    // shorter way to do the above
    // this is called "destructuring"
    val (firstVal2, secondVal2) = pair

    println("$firstVal2 and $secondVal2")

    println("--------------------")

    // Basic way to iterate over a map
    for(entry in mutableMap)
        println("${entry.key} -> ${entry.value}")

    println("--------------------")

    // Using "destructuring"
    for((key, value) in mutableMap)
        println("$key -> $value")

    println("--------------------")

    // we can use "destructuring" with our own custom classes,
    // but only if we give it component functions (see Car class)
    val car = Car("blue", "Corvette", 1959)
    val (color, model, year) = car

    println("color = $color, model = $model, year = $year")

    // data classes get component functions FOR FREE
    val car2 = DataClassCar("navy blue", "Mustang", 1999)
    val (car2color, car2model, car2year) = car2
    println("color = $car2color, model = $car2model, year = $car2year")


}

class Car(val color: String, val model: String, val year: Int) {
    operator fun component1() = color
    operator fun component2() = model
    operator fun component3() = year
}

data class DataClassCar(val color: String, val model: String, val year: Int) {}