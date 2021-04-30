package udemy.kotlincourse.section05

// this class extends Printer3 and implements MyInterface
open class LaserPrinter4(aModelName: String, ppm: Int): Printer3(aModelName), MyInterface {

    // all overrides need the 'override' keyword
    // if we want to prevent further overriding of a function, we can use 'final'
    final override fun printModel() = println("The model name of this laser printer is $modelName.")

    // must override abstract functions
    override fun bestSellingPrice(): Double = 129.99

    override fun myFunction(str: String): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}


open class Something2: MySubInterface {
    val someProperty: String

    constructor(someParameter: String) {
        someProperty = someParameter
        println("I'm in the parent's constructor")
    }

    override fun myFunction(str: String): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun mySubFunction(num: Int): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}


// interfaces are purely abstract classes
interface MyInterface {

    fun myFunction(str: String): String
}

interface MySubInterface: MyInterface {
    fun mySubFunction(num: Int): String
}