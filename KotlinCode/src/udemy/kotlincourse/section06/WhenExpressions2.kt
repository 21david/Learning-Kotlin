// Video 56

package udemy.kotlincourse.section06

enum class Season {
    SPRING, SUMMER, FALL, WINTER
}

fun main(args: Array<String>) {
    val timeOfYear = Season.SPRING

    // can declare the type for educational purpose:
    val timeOfYear2: Season = Season.SPRING

    var num = 0

    // best practice is for the when expression to return the same type in all cases
    // but it is possible to mix them
    // all of these cases return strings
    val str = when(timeOfYear) {
        Season.SPRING -> {
            num += 5
            "Flowers are blooming"
        }
        Season.SUMMER -> {
            "It's hot!"
        }
        Season.FALL -> {
            "Leaves are falling"
        }
        Season.WINTER -> {
             num = 22 - 55
            "I need a coat"
        }
        // we don't need an else because since we're using an enum
        // the compiler can check whether we've covered all possible cases
    }

    println(str)
    println(num)


    // and you can leave the () empty in the when
    // if you do, then it resembles a chain of if-else if-else statements
    var num1 = 20
    var num2 = 30
    when {
        num1 < num2 -> println("num1 < num2")
        num2 > num1 -> println("num2 > num1")
        else -> println("num1 == num2")
    }
}