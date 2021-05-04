// Video 69 (7:20)

package udemy.kotlincourse.section07

fun main(args: Array<String>) {

    val shorts: List<Short> = listOf(10, 20, 30, 40)
    val floats: List<Float> = listOf(123f, 10.23f, 69.420f)

    val shortsNullable: List<Short?> = listOf(10, 20, 30, 40, null)
    val floatsNullable: List<Float?> = listOf(123f, null, 10.23f, 69.420f)

    printCollection(shortsNullable)
    printCollection(floatsNullable)


    // what if we wanted to limit to non-nullable types?

    // this gives an error:
    // printCollectionNotNull(floatsNullable)

    // testing the strictly-not-nullable function:
    convertToInt2(shorts)
    // convertToInt2(shortsNullable)  // error

    // testing the accepts-nullable function:
    convertNullableToInt(shorts)  // no error
    convertNullableToInt(shortsNullable)  // no error
}

// This <T> accepts nullable types as well.
fun <T> printCollection(collection: List<T>) {
    for(item in collection)
        println(item)
}

// This <T: Any> does not receive nullable types.
fun <T: Any> printCollectionNotNull(collection: List<T>) {
    for(item in collection)
        println(item)
}


// The "<T: Number>" requires T to be a Number type (ONLY NON-NULLABLE)
fun <T: Number> convertToInt2(collection: List<T>) {
    for(num in collection)
        println("${num.toInt()}")  // because T is a Number, we can call .toInt() safely
}

// The "<T: Number?>" requires T to be a Number type (Nullable or non-nullable)
fun <T: Number?> convertNullableToInt(collection: List<T>) {
    for(num in collection)
        println("${num?.toInt()}")  // because T is a Number, we can call .toInt() safely
}