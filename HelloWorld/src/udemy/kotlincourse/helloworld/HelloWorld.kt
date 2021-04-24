package udemy.kotlincourse.helloworld

// This function isn't within a class
// functions declared outside classes are called "top-level functions"
// The class will be generated for us under-the-cover (Kotlin is meant to be more concise)
fun main(args: Array<String>) {
    // the A in Array is capitalized, everything is a class in Kotlin
    // Array is found in package kotlin, which is imported automatically
    // there is no array (lowercase) in Kotlin
    // also no return type for this function

    // Hello world!
    // no semi-colons in Kotlin
    println("Hello World!")  // println() is found on package kotlin.io, which is imported automatically
}