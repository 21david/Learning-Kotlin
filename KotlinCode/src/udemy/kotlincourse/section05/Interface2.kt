package udemy.kotlincourse.section05


open class Something3: MyInterface2 {
    val someProperty: String

    // override this property in MyInterface2
    override val number: Int = 25

    // optionally override number2 in MyInterface2
    override val number2: Int = 50

    constructor(someParameter: String) {
        someProperty = someParameter
        println("I'm in the parent's constructor")
    }

}

interface MyInterface2 {

    // interfaces can have abstract properties
    // if it is declared like this, it must be overridden by child classes
    val number: Int


    // cannot initialize properties within interfaces
    // val number2: Int = 50  // error

    // you can do this though:
    val number2: Int
        get() = number * 100

}