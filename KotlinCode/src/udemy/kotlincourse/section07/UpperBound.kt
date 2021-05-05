// Video 69

package udemy.kotlincourse.section07

fun main(args: Array<String>) {

    val ints = listOf(1, 2, 3, 4, 5)
    val shorts: List<Short> = listOf(10, 20, 30, 40)
    val floats: List<Float> = listOf(100.3f, 100.7f, -459.342f, -459.67f)

    convertToInt(ints)
    convertToInt(floats)

    line()

    // StringBuilder is both a CharSequence and a Appendable (through interfaces)
    append(StringBuilder("alligator"), StringBuilder("cat"))

    line()

    // unlike in Java, we can do this in Kotlin:
    val strings = listOf("Monster", "Zoa", "3D", "Red Bull", "Rockstar")
    if(strings is List<String>) {
        println("This list contains strings")
    }

    // generics do not make it into the bytecode, it is only used for compiling
    // "type erasure" means that at runtime, the JVM does not see generics (they get "erased")


    // <*> is called "star projection syntax"
    var listAny: Any = listOf("str1", "str2")
    if(listAny is List<*>) {
        println("Yes this is a list. Thank you star projection.")
    }

    listAny = listOf(1, 2, 3)
    if(listAny is List<*>) {
        println("This list contains strings")
        val strList = listAny as List<String>  // here, we risk a ClassCastException if this is impossible to do
        println(strList[1].replace("str", "String"))
    }

}

// The "<T: Number>" requires T to be a Number type
fun <T: Number> convertToInt(collection: List<T>) {
    for(num in collection)
        println("${num.toInt()}")  // because T is a Number, we can call .toInt() safely
}

// 'where' keyword used to specify what parent classes and implemented interfaces a type must have
// whatever T is, it has to be a subclass (or implement) all types after 'where'
// so it has to be a CharSequence and an Appendable
fun <T> append(item1: T, item2: T) where T: CharSequence, T: Appendable {
    println("appended value: ${item1.append(item2)}")
}

fun line() = println("-----------------------")