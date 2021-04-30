// Video 40

package udemy.kotlincourse.section05

fun main(args: Array<String>) {
    println("this is all in lowercase".upperFirstAndLast())

    println("this is all in lowercase".upperFirstAndLast2())


}

// extension function
// since we "added" this function to the String class, we can use it on strings
// Although this is actually just "syntactic sugar" and we're not actually adding it
// to the String class, not calling it on a String
// 'this' refers to whatever object it is called on (whatever String)
fun String.upperFirstAndLast(): String {
    val upperFirst = this.substring(0, 1).toUpperCase() + this.substring(1)
    return upperFirst.substring(0, upperFirst.length-1) +
            upperFirst.substring(upperFirst.length-1).toUpperCase()
}

// we can actually remove 'this' and it will still work
// substring() will be called on the String object
// you could also access any public members of the class you're extending by just using their name
// as long as they are public
fun String.upperFirstAndLast2(): String {
    println(length)  // access 'length' of the string being used
    val upperFirst = substring(0, 1).toUpperCase() + substring(1)
    return upperFirst.substring(0, upperFirst.length-1) +
            upperFirst.substring(upperFirst.length-1).toUpperCase()
}