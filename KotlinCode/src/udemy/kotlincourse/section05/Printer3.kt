// Video 42

package udemy.kotlincourse.section05

fun main(args: Array<String>) {
    val laserPrinter = LaserPrinter3("Brother 1500")
    laserPrinter.printModel()
    println(laserPrinter.bestSellingPrice())
}

// this one has a primary constructor (takes in no arguments)
abstract class Printer3(val modelName: String) {

    // for this function to be able to be overridden, it needs 'open' keyword
    open fun printModel() = println("The model name of this printer is $modelName.")

    // abstract methods (abstract functions are 'open' by default)
    abstract fun bestSellingPrice(): Double
}


class LaserPrinter3(aModelName: String): Printer3(aModelName) {

    // all overrides need the 'override' keyword
    override fun printModel() = println("The model name of this laser printer is $modelName.")

    // must override abstract functions
    override fun bestSellingPrice(): Double = 129.99

}