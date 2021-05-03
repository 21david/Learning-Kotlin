// Video 58

package udemy.kotlincourse.challenges

fun main(args: Array<String>) {

    // using a range, print 5, 10, 15, 20, 25... 5000, each number
    // on a separate line
    for(num in 5..5000 step 5)
        println(num)

    println("---------------------")

    // using a range, -500..0, each number on a separate line
    var range = -500..0
    for(num in range)
        println(num)

    println(range.javaClass) // prints "class kotlin.ranges.IntRange"
    println("---------------------")

    // using a range, print the first 15 numbers in the
    // Fibonacci sequence, each
    // number on a separate line
    // Hint: you'll have to print the first one or two numbers
    // outside the range
    // 0, 1, 1, 2, 3, 5, 8...

    var a = 0
    var b = 1
    var c: Int

    println(a)
    println(b)

    for(i in 1..15-2) {
        c = a + b
        a = b
        b = c
        println(c)
    }

    println("---------------------")

    // Modify the following code so that it prints the following,
    // each number on a separate line
    // 1, 11, 100, 99, 98, 2

    outerLoop@
    for (i in 1..5) {
        println(i)
        if(i == 2)
            break
        for (j in 11..20) {
            println(j)
            for (k in 100 downTo 90) {
                if(k == 97)
                    continue@outerLoop
                println(k)
            }
        }
    }

    println("---------------------")

    // Declare a variable called num (int) and assign it whatever you want
    var num = 69

    // Declare a variable called dnum (double) and assign it as follows:
    // if num > 100, assign dnum -234.567
    // if num < 100, assign dnum 4444.555
    // if num == 100, assign dnum 0.0
    // do all of the above (declaring dnum and assigning
    // it) in one statement/expression
    var dnum = if(num > 100) -234.567 else if(num < 100) 4444.555 else 0.0

    // Then print the value of dnum - separate statement
    println(dnum)

    // extra: can be done with 'when'
    val dnum2 = when {
        num > 100 -> -234.567
        num < 100 -> 4444.555
        else -> 0.0
    }

    println(dnum2)

    val dnum2: Double
    println(dnum2 = when {
        num > 100 -> -234.567
        num < 100 -> 4444.555
        else -> 0.0
    })
}