// Video 42

package udemy.kotlincourse.section05

open class Printer2 {

}

class LaserPrinter2: Printer2 {

    // this constructor defers to the super class's primary constructor
    // (i think this is LaserPrinter2's primary constructor)
    constructor(): super()

}