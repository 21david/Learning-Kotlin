// Video 31

package udemy.kotlincourse.section04

fun main(args: Array<String>) {
    val nullStr: String? = null
    val notNullStr: String? = "This is not null"


    printText(notNullStr!!, "printing notNullStr regularly")  // this will work fine
//  printText(nullStr!!, "printing nullStr regularly")  // this will throw an Exception


    // We can use the .let() function to deal with nulls
    // if it is not null, it will run the code
    // if it is null, nothing will happen
    // 'it' refers to the object it is being called on (str and notNullStr)
    nullStr?.let { printText(it, "printing nullStr using let") }  // nothing happens
    notNullStr?.let { printText(it, "printing notNullStr using let") }  // this will work fine


    val str4: String? = null
    val anotherString = "This isn't nullable"

    // let's consider a case
    // str4 is null, but we want to compare it with a string using ==
    // this is safe because Kotlin is smart
    // == is a "safe operator"
    println(str4 == anotherString)  // prints false

    println(null == null)  // prints true
}

fun printText(text: String, comment: String) {
    println("$text ($comment)")
}
