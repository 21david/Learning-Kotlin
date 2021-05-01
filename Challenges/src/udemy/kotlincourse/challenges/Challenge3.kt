package udemy.kotlincourse.challenges

val DEFAULT_GEAR = 12

fun main(args: Array<String>) {
    val bike = Bicycle(10, 7, 30)
    bike.printDescription()

    val mountainBike = MountainBike(12, 10, 7, 22)
    mountainBike.printDescription()

    val roadBike = RoadBike(5, 10, 8, 42)
    roadBike.printDescription()

    println("---------------")

    // Second challenge
    val bike2 = Bicycle(10, 7)
    bike2.printDescription()

    val mountainBike2 = MountainBike(12, 10, 22)
    mountainBike2.printDescription()

    val roadBike2 = RoadBike(5, 10, 42)
    roadBike2.printDescription()

    println("---------------")

    val mountainBike3 = MountainBike("Navy blue", 6, 5, 5)
    mountainBike3.printDescription()

    println("---------------")
    print("Available colors are: ")
    for(color in MountainBike.availableColors)
        print("$color, ")
    println("and that's it.")

    println("---------------")
    print("Available colors are: ")
    MountainBike.availableColors.forEach { print("$it, ") }
    println("and that's it.")


}


// Convert Java Bicycle class to Kotlin
open class Bicycle(var cadence: Int, var speed: Int, var gear: Int = DEFAULT_GEAR) {

    fun applyBrake(decrement: Int) {
        speed -= decrement
    }

    fun speedUp(increment: Int) {
        speed += increment
    }

    open fun printDescription() {
        println("Bike is in gear $gear with a cadence of $cadence traveling at a speed of $speed.")
    }

}


// Convert Java MountainBike class to Kotlin
// since 'seatHeight' has a get and a set method, we declare it as var
// that way, it has a get and a set by default (which is just calling it like mountainBike.seatHeight)
class MountainBike(var seatHeight: Int, c: Int, s: Int, g: Int = DEFAULT_GEAR):
        Bicycle(c, s, g) {

    companion object {
        val availableColors: List<String> = listOf("blue", "red", "white", "black", "green", "brown")
    }

    // better to put optional parameters at the end to prevent having to use labeled parameters
    constructor(color: String, sH: Int, c: Int, s: Int, g: Int = DEFAULT_GEAR + 10): this(sH, c, s, g) {
        println(color)
    }

    override fun printDescription() {
        super.printDescription()
        println("The mountain bike has a seat height of $seatHeight inches.")
    }
}

// Convert Java RoadBike class to Kotlin
// since 'tireWidth' only has a getter method in the Java file, we make it a val
// that way we can access it (takes care of the get method), but we can't set it
class RoadBike(val tireWidth: Int, c: Int, s: Int, g: Int = DEFAULT_GEAR):
        Bicycle(c, s, g) {

    override fun printDescription() {
        super.printDescription()
        println("The road bike has a tire width of $tireWidth millimeters.")
    }
}