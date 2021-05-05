// Video 72

// created a package to re-declare Flower, Rose, etc.
package udemy.kotlincourse.section07.contravariance

fun main(args: Array<String>) {
    val flowerTender: FlowerCare<Flower> = object: FlowerCare<Flower> {
        override fun prune(flower: Flower) = println("I'm tending a ${flower.name}!")
    }

    // anonymous class that implements FlowerCare<T>
    val roseTender: FlowerCare<Rose> = object: FlowerCare<Rose>{
        override fun prune(flower: Rose) = println("I'm pruning a rose!")
    }

    // because T in FlowerCare<in T> is contravariant, we can send a FlowerCase<Flower>
    // as the second parameter to this Garden<Rose> constructor
    val roseGarden = Garden<Rose>( listOf(Rose(), Rose(), Rose()), flowerTender )
    roseGarden.tendFlower(0)

    val daffodilTender: FlowerCare<Daffodil> = object: FlowerCare<Daffodil> {
        override fun prune(flower: Daffodil) = println("I'm pruning a daffodil!")
    }

    val daffodilGarden = Garden<Daffodil>( listOf(Daffodil(), Daffodil(), Daffodil()), flowerTender)
    daffodilGarden.tendFlower(2)

    // because List is not contravariant, we can't pass in a list of Flowers to a Garden<Rose>
    // but FlowerCare<T> is, so we can pass in a FlowerCare<Flower> to a Garden<Rose>
   // val daffodilGarden2 = Garden<Rose>( listOf(Flower(""), Flower(""), Flower("")), flowerTender)  // error

}

// contravariance is the opposite of covariance. this time, we want to accept
// the given type, OR any supertypes
// FlowerCare<T> is contravariant (see it's declaration at the bottom)
// so since this constructor accepts a FlowerCare<T>, it can accept any supertype as well, because
// FlowerCare is contravariant. Example: it could take a FlowerCare<Flower>, FlowerCare<Rose>, FlowerCare<Daisy>, etc.
// whereas List<T> can only take T or subtypes (List<T> is covariant)
// for example, if Garden is declared as Garden<Rose>, then it can only take List<Rose> or List<[subclass of rose]>,
// but not List<Flower> (see commented code at the bottom in main())
class Garden<T: Flower>(val flowers: List<T>, val flowerCare: FlowerCare<T>) {

    fun pickFlower(i: Int) = flowers[i]

    fun tendFlower(i: Int) {
        flowerCare.prune(flowers[i])
    }
}

open class Flower(val name: String) {}

class Rose: Flower("🌹") {}

class Daffodil: Flower("🌼") {}

// 'in' gives it 'contravariance'
// now FlowerCare<T> is contravariant
interface FlowerCare<in T> {
    fun prune(flower: T)

    // we can't do this because T is contravariant, and is in the 'out' position
    // T is restricted to the 'in' position (like in prune())
    //    fun pick(): T
}