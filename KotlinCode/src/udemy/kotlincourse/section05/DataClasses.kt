// Video 38

package udemy.kotlincourse.section05

fun main(args: Array<String>) {
    val car1 = Car("blue", "benz", 2007)
    println(car1)  // we get a decent toString() for free

    val car2 = Car("blue", "benz", 2007)
    println(car2 == car1)  // true, they are structurally equal

    // we can make copies using the copy() function
    val car3 = car1.copy()
    println(car3)

    // we can copy everything but change certain things with copy()
    val car4 = car1.copy(year = 2017)
    println(car4)

    val car5 = car1.copy(year = 2020, color = "black") // property names have to match, ex 'year'
    println(car5)

}

// data classes come with a toString() function, equals(), hashCode(), and copy()
// which we could override if we don't like the default
data class Car(val color: String, val model: String, val year: Int) {
    // to make a data class, the primary constructor has to have at least 1 parameter
    // and all parameters have to be marked 'val' or 'var' (unlike regular classes)
    // data classes can't be abstract, sealed, or inner classes

    // data classes are good for anything that just stores "state"
}