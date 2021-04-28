// Video 31

package udemy.kotlincourse.section04

fun main(args: Array<String>) {
    // we declare a nullable variable
    // meaning we have to use the ? syntax for all uses of it (example: str?.toUpperCase())
    // otherwise, the code won't compile
    val str1: String? = "This isn't null"
    val str2: String? = null

    // if we're positive that the variable isn't null
    // we can use !! syntax (!! is the non-null assertion)
    // !! lets us risk using the variable. If it is not null, it will work, but if it is null
    // it will throw an Exception(), but it at least lets us try to use it
    val newStr1 = str1!!.toUpperCase()
    println(newStr1)
    val newStr2 = str2!!.toUpperCase()  // this one will throw a kotlin.KotlinNullPointerException


    // str1!!.toUpperCase()
    // boils down to:
    if(str1 == null) {
        throw Exception()
    }
    else {
        str1.toUpperCase()
    }



}