package udemy.kotlincourse.challenges

fun main(args: Array<String>) {

    // Challenge 2
    val hello1 = "Hello"
    val hello2 = "Hello"  // "Hello" already exists, so a new one is not created

    // Challenge 3
    println(hello1 === hello2)  // true

    // hello1 === hello2 prints true because since they both have the same string "Hello",
    // they are actually using the same string literal, so they are really both
    // pointing to the same object (string)

    // Challenge 4
    println("hello1 and hello2 are structurally equal: ${hello1 == hello2}")  // true

    // Challenge 5
    var num = 2988

    // Challenge 6
    val obj: Any = "The Any type is the root of the Kotlin class hierarchy"
    if(obj is String) {
        // smart casting
        println(obj.toUpperCase())
    }

    // Challenge 7
    println("    1\n   11\n  111\n 1111")

    // or

    println("""    1
              |   11
              |  111
              | 1111""".trimMargin())


    // Challenge 8
    println("""1    1
               1   11
               1  111
               1 1111""".trimMargin("1"))
    
}