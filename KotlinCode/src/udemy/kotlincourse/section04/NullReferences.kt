// Video 30

package udemy.kotlincourse.section04

fun main(args: Array<String>) {

    // data types, by default, can't be set to null in Kotlin
    // val str: String = null  <-- error

    // to be able to set to null, add a ? to the type
    val str1: String? = null
    val str2: String? = "This isn't null"

    if (str2 != null) {
        // Kotlin compiler only lets us use certain methods if we
        // have already checked that an object is not null
        // kinda similar to smart casting
        println(str2.toUpperCase())  // THIS ISN'T NULL
    }


    // The ? syntax:
    // Essentially shorthand for "if(str2 != null)"
    // I can imagine as saying "does this object have a value? if so, use it, if not, just return null"
    // it's like its asking if it even has a value
    println(str1?.toUpperCase())  // prints 'null', because str1 is null (doesn't give a NullPointerException though)
    println(str2?.toUpperCase())  // prints the string value, because it's not null

    // So whenever you use a data type with ? (String?, Int?), then you have to use ? whenever you
    // use the variable

    // So basically...
    str1?.toUpperCase()

    // boils down to:
    if (str1 == null) {
        null  // return null
    } else {
        str1.toUpperCase()  // call toUpperCase() and return the result
    }

    // it's shorthand that reduces lines of code by a lot

    // if the first ? results in null, nothing else gets  (like a short-circuit), so this would
    // be a safe thing to do:
    // val countryCode: Int? = bankBranch?.address?.country?.countryCode?.code
    // in Java, you would need many if statements for this


    // The Elvis operator:
    // ?:
    // It lets you assign default value that will be used instead of null
    val nullString: String? = null
    var maybeNull = nullString ?: "Default value if it was null"

    println(maybeNull)  // prints "Default value if it was null"

    // So the Elvis operator boils down to:
    if (nullString == null) {
        maybeNull = "Default value if it was null"
    } else {
        maybeNull = nullString
    }

    // Example of Elvis operator with ? syntax:
    // val whatever = bankBranch?.address?.country ?: "US"
    // if any of the variables above results in null, "US" will be used as the value for 'whatever'

    val something: Any = arrayOf(1, 2, 3, 4)
    val str3 = something as? String  // this can't work (casting IntArray to String), so it gets 'null'

    println(str3)  // prints null

    // if we use the 'as?' syntax, the value (str3 above) will be nullable
    // so str3 will be of type String?
    // meaning we have to use ? syntax for that variable forever

    println(str3?.toUpperCase())  // prints null



    // best practice is to not use nullable types unless you have to
}

class BankBranch(address: Address) {

}

class Address(country: Country, street: String) {

}

class Country(countryCode: CountryCode) {

}

class CountryCode(code: Int) {}
