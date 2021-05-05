package udemy.kotlincourse.section07.contravariance


fun main(args: Array<String>) {

    /*** INVARIANT TYPE EXAMPLE *********************************/
    val garden1 = GardenInvariant2<Rose2>(Rose2())
    val garden2 = GardenInvariant2<Flower2>(Flower2())
    val garden3 = GardenInvariant2<PinkRose2>(PinkRose2())

    // this function strictly accepts GardenInvariant2<Rose2>, because GardenInvariant2 is invariant
    fun acceptInvariantType(roseGarden: GardenInvariant2<Rose2>) {}

    acceptInvariantType(garden1)
//  acceptInvariantType(garden2)  // error: Type mismatch (for passing in a supertype)
//  acceptInvariantType(garden3)  // error: Type mismatch (for passing in a subtype)


    /*** COVARIANT TYPE EXAMPLE *********************************/
    val garden4 = GardenCovariant<Rose2>(Rose2())
    val garden5 = GardenCovariant<Flower2>(Flower2())
    val garden6 = GardenCovariant<PinkRose2>(PinkRose2())

    // this function accepts GardenCovariant<Rose2> or subtypes (GardenCovariant<PinkRose2> for example)
    fun acceptCovariantType(garden: GardenCovariant<Rose2>) {}

    acceptCovariantType(garden4)
//  acceptCovariantType(garden5)  // error: Type mismatch (for passing in a supertype)
    acceptCovariantType(garden6)


    /*** CONTRAVARIANT TYPE EXAMPLE ******************************/
    val garden7 = GardenContravariant<Rose2>(Rose2())
    val garden8 = GardenContravariant<Flower2>(Flower2())
    val garden9 = GardenContravariant<PinkRose2>(PinkRose2())

    // this function accepts GardenContravariant<Rose2> or supertypes (GardenContravariant<Flower2> for example)
    fun acceptContravariantType(garden: GardenContravariant<Rose2>) {}

    acceptContravariantType(garden7)
    acceptContravariantType(garden8)
//  acceptContravariantType(garden9)  // error: Type mismatch (for passing in a subtype)



}


class GardenInvariant2<T: Flower2>(val something: T) {}

class GardenCovariant<out T: Flower2>(val something: T) {}

class GardenContravariant<in T: Flower2>(something: T) {}


open class Flower2 {}

open class Rose2: Flower2() {}

class PinkRose2: Rose2() {}





