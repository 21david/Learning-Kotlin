// Video 61

package udemy.kotlincourse.section07

fun main(args: Array<String>) {
    println(countTo100WithWith())
    println(countTo100WithWith2())
    println(countTo100WithWith3())
    println(countTo100WithApply())
}

fun countTo100(): String {
    val numbers = StringBuilder()
    for(i in 1..99) {
        numbers.append(i)
        numbers.append(", ")
    }
    numbers.append(100)

    return numbers.toString()
}

fun countTo100WithWith(): String {
    val numbers = StringBuilder()

    // using 'with', we can call functions of the object
    // we passed in by just calling the function
    // (as if we were inside the class of that object)
    return with(numbers) {
        for (i in 1..99) {
            // can use 'this' to refer to the object
            this.append(i)

            // but why use it if you don't have to
            append(", ")
        }
        append(100)

        return toString()  // the toString() function of StringBuilder
    }
}

fun countTo100WithWith2(): String {

    // we can just create an anonymous StringBuilder object
    // on-the-fly and pass it in
    return with(StringBuilder()) {
        for (i in 1..99) {
            append(i)
            append(", ")
        }
        append(100)

        toString()  // return the String version ('return' keyword optional)
    }
}

// now it's all in one line (technically)
// so we can make it an expression function
fun countTo100WithWith3() =
    with(StringBuilder()) {
        for (i in 1..99)
            append("$i, ")
        append(100)
        toString()  // return the String version
    }


// 'apply' is similar to 'with'
fun countTo100WithApply() =
        StringBuilder().apply {
            for (i in 1..99)
                append("$i, ")
            append(100)
        }.toString()  // return the String version