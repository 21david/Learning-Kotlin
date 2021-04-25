package udemy.kotlincourse.declarations

// Video 20

fun main(args: Array<String>) {
    // semi-colons are not required, but they can still be used w/out errors
    val number = 2;
    var number2 = 3;
    number2 = 4;

    println(number2);

    // Kotlin has "hard keywords" and "soft keywords"
    // hard keywords can't be used as variable names
    // soft keywords can be used as variable names, as long as
    //  you don't use them where that keyword would be used

    // in Kotlin, we can use [] to access elements in data structures
    // for maps, you can put the key between the [] (we will see later)
    val names = arrayListOf("John", "Jane", "Mary")
    println(names[1]) // prints Jane
    println(names[0]) // prints John

    // Kotlin String class is different from Java String class
    //   https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/
    // length is a property, not a method, so you access the length using .length (unlike Java)
    val name: String = "Smitty Werbenjagermanjensen"
    println(name.length)


    // Exceptions are different in Kotlin
    // you don't have to declare exceptions that may occur in a method's header (unlike Java)
    // the 'throws' keyword doesn't even exist


    // The ternary operator
    // var test = (5 == 5) ? "assign this if true" : "assign this if false"
    // ^ this doesn't exist in Kotlin
    // in Kotlin, if is an expression (like in Scala)
    var test = if(5 == 5) "assign this if true" else "assign this if false"
    println(test)



    // The original for loop doesn't exist!
    // this gives errors:
    //    var i: Int
    //    for(i = 0; i < 20; i++) { println(i) }



    // Kotlin doesn't have a 'static' keyword
    // The concept is still there though. This main class is a "top-level function", so it is
    // secretly (under-the-cover) a static function in a class


    // Kotlin doesn't have a 'new' keyword
    var new = "new is not a keyword, can be used as variable name!"
    println(new)
}