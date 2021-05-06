// Video 81

package udemy.kotlincourse.section09

import udemy.kotlincourse.section09.javacode.AJavaClass

fun main(args: Array<String>) {

    // variable arg method
    val max = AJavaClass().max(5,-4, 3, -2, 1, 100, 4, 3, 21, 3, 9, -5, -100, 3, 12, 3)
    println(max)

    val max2 = AJavaClass().maxWithGreeting("Joseph", 5, -6, 9, 0, 1, 2, 400, 30, 1, 5, 9, -3, 3)
    val max3 = AJavaClass().maxWithGreeting("Maria")
    println(max2)
    println(max3)

    val arrayOfInts: IntArray = arrayOf(-30, 10, -14, 23, 19, 532, 12, -50, 43, -400, 20, 13, 5).toIntArray()  // need an IntArray for variable argument int method in Java
    val arrayOfInts2: IntArray = intArrayOf(-40, 10, -20, 30, -14, 16, 17, -20, -23, 433, -2, -20, -12, 0, 34, 61)  // another way to get an IntArray

    val max4 = AJavaClass().maxWithGreeting("Bill", *arrayOfInts) // need the spread operator
    println(max4)

    val max5 = AJavaClass().maxWithGreeting("Gusana", *arrayOfInts2) // need the spread operator
    println(max5)

    line()

    val kotlinObject: AJavaClass = AJavaClass()
    println(kotlinObject.anObject.javaClass)  // java.lang.Object

    // Objects in Java get converted to "Any!" when used in Kotlin code
    // we can cast back to Object to recover some of the Object methods.
    // (9:40 in video 81)
//  (kotlinObject.anObject as java.lang.Object).notify()

    line()

    /*****************************/
    // Static stuff in Java
    // nothing really new or different

    println("x = ${AJavaClass.x}")
    println(AJavaClass.xString())
    println(AJavaClass.xString())
    println(AJavaClass.xString())
    /*****************************/

    line()

    /*****************************/
    // Using a Java function that expects a SAM interface type of object:
    // We can take a shortcut and just pass in code (we're passing in a lambda)
    // The code we pass in is what will override the one abstract method we need
    // to overwrite - in this case, the run() method in Runnable.

    kotlinObject.demoMethod3 { println("I'm in a thread! (This String comes from Kotlin)") }
    /*****************************/


}

fun line() = println("-------------------------")