// Video 73

package udemy.kotlincourse.section07.usesitevariance

fun main(args: Array<String>) {
    val cars1 = mutableListOf(Car(), Car())
    val cars2: MutableList<Car> = mutableListOf()
    copyCars1(cars1, cars2)  // no error

    val fords1 = mutableListOf(Ford(), Ford())
    val fords2: MutableList<Ford> = mutableListOf()

 // copyCars1(fords1, fords2)  // error, because generic types are invariant, copyCars1 wants MutableList<Car>, not MutableList<Ford>

    copyCars2(fords1, fords2) // no error
 // copyCars2(fords1, cars2)  // error, bc the types have to match. So both have to be either MutableList<Car> or MutableList<Ford>

    copyCars3(fords1, cars2)  // no error

    copyCars4(fords1, cars2)  // no errors
}

// in this version, both parameters accept only MutableList<Car>, no subtypes or supertypes are allowed
fun copyCars1(source: MutableList<Car>, destination: MutableList<Car>) {
    for(car in source)
        destination += car
}

// in this version, T has to be the same for both parameters
fun <T> copyCars2(source: MutableList<T>, destination: MutableList<T>) {
    for(car in source)
        destination += car
}

// in this version, the type for source is covariant, so now, source can have subtypes of the destination type
// now we can have MutableList<Ford> or MutableList<Toyota> in source, and MutableList<Car> in destination
// the logic here is that we are only reading from source, and only writing to destination. this can give us a hint.
// we're not gonna add anything to source, so we don't have to worry about putting a Car in a list of Fords (potentially mixing types)
// using 'out' here is called "Use site variance", or also "type projection"
fun <T> copyCars3(source: MutableList<out T>, destination: MutableList<T>) {
    for(car in source)
        destination += car
}

// this would also work (using contravariance)
fun <T> copyCars4(source: MutableList<T>, destination: MutableList<in T>) {
    for(car in source)
        destination += car
}


open class Car {}

class Toyota: Car() {}

class Ford: Car() {}