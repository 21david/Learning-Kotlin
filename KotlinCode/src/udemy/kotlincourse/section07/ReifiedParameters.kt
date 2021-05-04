package udemy.kotlincourse.section07

import java.math.BigDecimal

fun main(args: Array<String>) {

    val mixedList: List<Any> = listOf("string", 2147483647, BigDecimal(0.00000001), 32767.toShort(), Any(), BigDecimal(420.69), 20.99f, "fall", 2000000L)
    val bigDecimalsOnly = getElementsOfType<BigDecimal>(mixedList)

    line("BigDecimals")

    for(item in bigDecimalsOnly)
        println(item)

    line("Strings")

    val stringsOnly = getElementsOfType<String>(mixedList)
    for(item in stringsOnly)
        println(item)

    line("Numbers")

    val numbersOnly = getElementsOfType<Number>(mixedList)
    for(item in numbersOnly)
        println(item)

}

// returns only the elements of a certain type in a list of Any
// to prevent type erasure (so that we can do "if(element is T)", we need to make the
// function an inline function, then "reify" the T. Otherwise it wouldn't work b/c "T" would be "erased"
inline fun <reified T> getElementsOfType(list: List<Any>): List<T> {
    var newList: MutableList<T> = mutableListOf()
    for(element in list) {
        if(element is T)
            newList.add(element)
    }

    return newList
}

// use reification only when you need to check the type in a function