// Video 31

package udemy.kotlincourse.section04

fun main(args: Array<String>) {

    val str: String? = null
    val str2 = str!!  // this throws a kotlin.KotlinNullPointerException

    // an explanation for this is the code that it boils down to:
    if(str == null) {
        throw Exception()
    }
    else {
        str
    }

    // in general, this is possible, but a bad idea:
    // var countryCode = bankBranch!!.address!!.country!!.code
    // if it throws an exception, you won't know which one caused it
}

