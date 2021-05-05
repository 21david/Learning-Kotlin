// Video 71

package udemy.kotlincourse.section07

// summary: 'out' keyword makes something covariant, meaning it is more
// relaxed on what it can accept. For example, List is covariant, so
// where a List<Number> is expected, we can pass in a List<Short>, List<Double>, List<BigDecimal>, etc.
// otherwise, it would be 'invariant', meaning we would strictly need a List<Number>
// (as in the case of MutableList<T>)
fun main(args: Array<String>) {
    // subtypes: a List<Int> is a subtype of List<Number>

    val shortList: MutableList<Short> = mutableListOf(1, 2, 3, 4, 5)

    // this gives error because MutableList is NOT covariant
    // meaning, that MutableList<Short> cannot be passed in as MutableList<Number>
    // convertToInt3(shortList)  // error

    /****************************************/

    fun acceptInvariantType(obj: GardenInvariant<Flower>) {}

    val object1 = GardenInvariant<Rose>(Rose())
    // acceptInvariantType(object1) // error

    /****************************************/

    fun acceptCovariantType(obj: Garden<Flower>) {}

    val object2 = Garden<Flower>(Flower())
    val object3 = Garden<Rose>(Rose())

    acceptCovariantType(object2)  // no error
    acceptCovariantType(object3)  // no error


}

// MutableList<T> is invariant, so we can only pass strictly MutableList<Number> lists to this function
// MutableList<T> class does not have the 'out' keyword
// I think the logic behind this is that if we pass in a MutableList<Int> for example,
// it doesn't want the code to be able to add a Double into the list, or a Long, Byte, BigDecimal, etc.
fun convertToInt3(collection: MutableList<Number>) {
    for(num in collection)
        println("${num.toInt()}")
}

fun tendGarden(roseGarden: Garden<Rose>) {
    waterGarden(roseGarden)
}


fun waterGarden(garden: Garden<Flower>) {}


open class Flower {}

class Rose: Flower() {}

// this class is invariant
// meaning, if we ask for a garden of Flowers in a function signature, we strictly
// need a garden of Flowers (not Roses, Daisies, etc.)
// So we can only accept Garden<Flower> and not Garden<Rose>, etc..
// (see acceptInvariantType() in main method)
class GardenInvariant<T: Flower>(val something: T) {

}


// now this class is "covariant" because we used the 'out' keyword
// So if we ask for a garden of Flowers, it can be a garden of Roses, a garden of Daisies, etc.
// (see acceptCovariantType() in main method)
class Garden<out T: Flower>(val something: T) {

    val flowers: List<T> = listOf()

    // in this function, 'T' is in the 'out' position, meaning that
    // it is being used for output going out
    // we are allowed to do this
    fun pickFlower(i: Int): T = flowers[i]

    // this function gives us an error because 'T' is in the 'in' position
    // meaning that its being used for input coming in
    // we can't do this
    //   fun plantFlower(flower: T) {}
}