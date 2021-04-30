// Video 45, 46

package academy.learnprogramming.inheritance

import java.time.Year

fun main(args: Array<String>) {

    println(CompanyCommunications.getTagLine())
    println(CompanyCommunications.getCopyrightLine())

    println(SomeClass.accessPrivateVar())  // access stuff from the companion object like this

    val someClass1 = SomeClass.justAssign("this is the string as is")
    val someClass2 = SomeClass.upperOrLowerCase("this isn't the string as is", false)

    println(someClass1.someString)
    println(someClass2.someString)

    // can't do this
    // val someClass3 = SomeClass()
}

// this class is for a singleton object
// a singleton object is an object that there will only ever be 1 of
// that object gets created the first time CompanyCommunications is used
object CompanyCommunications {

    val currentYear = Year.now().value

    fun getTagLine() = "Our company rocks!"
    fun getCopyrightLine() = "Copyright \u00A9 $currentYear Our Company. All rights reserved."
}


class SomeClass private constructor(val someString: String) {

    // you can think of everything within a companion object as being 'static'
    // we can call these without needing an instance of this class
    // can optinally name it. If no name, default name is "Companion"
    companion object SomeCompanion {
        private var privateVar = 60

        fun accessPrivateVar() = "I'm accessing privateVar: $privateVar"

        // since we made the primary constructor private, these are the ways
        // to make SomeClass objects. This is the "Factory" pattern
        fun justAssign(aString: String) = SomeClass(aString)
        fun upperOrLowerCase(str: String, wantLowerCase: Boolean): SomeClass {
            if(wantLowerCase)
                return SomeClass(str.toLowerCase())
            else
                return SomeClass(str.toUpperCase())
        }
    }


    /*
    private val privateVar = 6

    fun accessPrivateVar() {
        println("I'm accessing privateVar: $privateVar")
    }
    */
}

