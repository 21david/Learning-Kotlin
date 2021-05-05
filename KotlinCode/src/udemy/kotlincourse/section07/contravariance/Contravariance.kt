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
interface FlowerCare<in T> {
    fun prune(flower: T)

    // we can't do this because T is contravariant, and is in the 'out' position
    // T is restricted to the 'in' position (like in prune())
    //    fun pick(): T
}