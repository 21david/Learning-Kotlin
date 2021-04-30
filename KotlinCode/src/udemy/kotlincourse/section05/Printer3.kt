// Video 42, 43

package udemy.kotlincourse.section05

fun main(args: Array<String>) {
    val laserPrinter = LaserPrinter3("Brother 1500", 120)
    laserPrinter.printModel()
    println(laserPrinter.bestSellingPrice())

    SomethingElse("whatever")
}

// this one has a primary constructor (takes in no arguments)
abstract class Printer3(val modelName: String) {



    // for this function to be able to be overridden, it needs 'open' keyword
    open fun printModel() = println("The model name of this printer is $modelName.")

    // abstract methods (abstract functions are 'open' by default)
    abstract fun bestSellingPrice(): Double
}

// you need the 'open' keyword to be able to override a class (or 'abstract')
open class LaserPrinter3(aModelName: String, ppm: Int): Printer3(aModelName) {

    // all overrides need the 'override' keyword
    // if we want to prevent further overriding of a function, we can use 'final'
    final override fun printModel() = println("The model name of this laser printer is $modelName.")

    // must override abstract functions
    override fun bestSellingPrice(): Double = 129.99

}

class SpecialLaserPrinter3(aModelName: String): LaserPrinter3(aModelName, 150) {

    // cannot override printModel() b/c it is declared as final in parent class
   // override fun printModel() = println("this is my way of doing it")
}


// these classes have no primary constructors
open class Something {
    val someProperty: String

    constructor(someParameter: String) {
        someProperty = someParameter
        println("I'm in the parent's constructor")
    }
}

class SomethingElse: Something {

    // you can only delegate to a secondary constructor if there is no primary constructor
    constructor(someOtherParameter: String): super(someOtherParameter) {
        println("I'm in the child's constructor")
    }
}

// data classes can't be extended, abstract, nor inner classes
// but they can extend other classes
data class DataClass(val number: Int) {

}