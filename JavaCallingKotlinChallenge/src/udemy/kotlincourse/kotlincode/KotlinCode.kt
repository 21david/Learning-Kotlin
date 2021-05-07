// Video 84
// Challenges for section 9

@file:JvmName("KotlinStuff")

package udemy.kotlincourse.kotlincode

fun sayHelloToJava(name: String) {
    println("Kotlin says hello to Java and $name")
}

object Challenge {
    @JvmStatic fun doMath(x: Int, y: Int) = (x + y) * (x - y)
}

class EmployeeB(val firstName: String, val lastName: String, @JvmField var startYear: Int) {

    @JvmOverloads
    fun takesDefault(parm1: String, parm2: String = "default") {
        println("$parm1 and $parm2")
    }
}