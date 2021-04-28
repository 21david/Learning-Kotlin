package academy.learnprogramming.challenge2

import java.util.*

fun main(args: Array<String>) {

    // 1. Declare a non-nullable float variable two ways,
    // and assign it the value -3847.384
    // all of these work
    val float1 = -3847.384f
    val float2 = -3847.384F
    val float3 = (-3847.384).toFloat()
    val float4: Float = (-3847.384).toFloat()
    println("$float1, $float2, $float3, $float4")
    println("${float1 is Float}, ${float2 is Float}, ${float3 is Float}, ${float4 is Float}")  // all true


    // 2. Now change both of those variable declarations into nullable variables.
    val float5: Float? = -3847.384f
    val float6: Float? = (-3847.384).toFloat()


    // 3. Now declare an array of type non-nullable Short. Make it size 5,
    // and assign it the values 1, 2, 3, 4, and 5.
    val arr1 = arrayOf<Short>(1, 2, 3, 4, 5)
    val arr2: Array<Short> = arrayOf(1, 2, 3, 4, 5)  // this one surprised me
    val arr3: Array<Short> = Array<Short>(5) { i -> (i+1).toShort() }
    val arr4 = shortArrayOf(1, 2, 3, 4, 5)

    println(Arrays.toString(arr1))
    println(Arrays.toString(arr2))

    println(arr1 is Array<Short>)  // true
    println(arr2 is Array<Short>)  // true
    println(arr3 is Array<Short>)  // true
    println(arr4 is ShortArray)  // true


    // 4. Now declare an array of nullable Ints and initialize it with the values
    // 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, etc., all the way up to 200.
    val arr5 = Array<Int?>(40) { i -> (i+1)*5 }

    println(Arrays.toString(arr5))


    // 5. You have to call a Java method with the following signature from Kotlin:
    // public void method1(char[] charArray). Declare an array that you could
    // pass to the method and initialize it with the values 'a', 'b', and 'c'.
    val arr6: CharArray = arrayOf('a', 'b', 'c').toCharArray()
    val arr7: CharArray = arrayOf<Char>('a', 'b', 'c').toCharArray()
    val arr8: CharArray = charArrayOf('a', 'b', 'c')


    // 6. Given the following code:
    val x: String? = "I AM IN UPPERCASE"
    // Using one line of code, declare another string variable,
    // and assign it x.toLowerCase() when x isn't null,
    // and the string "I give up!" when x is null.
    val y: String = x?.toLowerCase() ?: "I give up!"

    println(y)  // prints "i am in uppercase"



    // 7. Now use the let function to (a) lowercase the string, and then
    // (b) replace "am" with "am not" in the result
    val z = x?.let{ it.toLowerCase().replace("am", "am not") }
    println(z) // prints "i am not in uppercase"


    // 8. You're really, really confident that the variable myNonNullVariable can't
    // contain null.
    // Change the following code to assert that myNonNullVariable isn't null
    // (and shoot yourself in the foot!)
    val myNonNullVariable: Int? = null
  //  myNonNullVariable!!.toDouble()

}



