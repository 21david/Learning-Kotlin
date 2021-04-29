// Video 39

package udemy.kotlincourse.section05

// default return type for a function is "Unit"
// since its default, you don't have to specify it
fun main(args: Array<String>) {
    println(labelMultiply3(3, 4, "The result is:"))
    voidFunction()

    val emp = Employee3("Christian")
    println(emp.upperCaseFirstName())

    println(labelMultiply4(13, 27))

    // you can mix up the order of parameters, if you type their names out:
    // if you do, you have to provide names for all parameters
    // this is called "named arguments"
    println(labelMultiply4(label = "Here's the result:", operand2 = 33, operand1 = 17))



    val car1 = Car("blue", "benz", 2007)
    val car2 = Car("yellow", "benz", 2007)
    val car3 = car1.copy()
    val car4 = car1.copy(year = 2017, color = "red")
    val car5 = car1.copy(year = 2020, color = "black")

    // variable argument function
    printColors(car1, car2, car3, car4, car5)

    // name parameter REQUIRED, because vararg parameter is not last in this function
    printColors2(car1, car2, car3, str = "Color: ")

    // name parameters NOT required, because vararg parameter is last in this function
    printColors3("Color: ", car1, car2, car4, car3)

    println()

    val manyCars = arrayOf(car1, car2, car3, car4, car5)

    // this is the "spread" operator. it "unpacks" an array
    // this way, an array can be passed as multiple arguments to a variable argument function
    // (it wont work otherwise)
    printColors(*manyCars)

    // another example:
    val moreCars = arrayOf(car2, car3, car4)
    val lotsOfCars = arrayOf(*manyCars, *moreCars, car5)
    printColors(*lotsOfCars)

}

fun labelMultiply(operand1: Int, operand2: Int, label: String): String {
    // This is a "block body" because it is enclosed in curly braces
    return ("$label ${operand1 * operand2}")
}

// we can shorten above function into:
fun labelMultiply2(operand1: Int, operand2: Int, label: String): String =
        "$label ${operand1 * operand2}"  // this is an "expression body"


// Shorten it even more, return type can be inferred:
fun labelMultiply3(operand1: Int, operand2: Int, label: String) =
        "$label ${operand1 * operand2}"

// We can use default values for functions
// we give a default value for 'label' here
// (for default values, we still have to explicitly declare the type, such as String)
fun labelMultiply4(operand1: Int, operand2: Int, label: String = "The answer is:") =
        "$label ${operand1 * operand2}"


// this works:
// type is inferred as Unit
fun voidFunction() =
        println("This print statement doesn't return anything, so return type is Unit")

// We can have variable amount of arguments, just like in Java
// in Java, the syntax is like public int max(int... nums) { /* code */ }
fun printColors(vararg cars: Car) {
    println("\nprintColors(vararg cars: Car) ----------------")
    for(car in cars)
        println(car.color)
}

fun printColors2(vararg cars: Car, str: String) {
    println("\nprintColors2(vararg cars: Car, str: String) --------")
    for(car in cars)
        println("$str ${car.color}")
}

fun printColors3(str: String, vararg cars: Car) {
    println("\nprintColors3(str: String, vararg cars: Car) --------")
    for(car in cars)
        println("$str ${car.color}")
}


// technically, this is how you would declare a void function
fun main2(args: Array<String>): Unit {
    println("print instruction")
}

class Employee3(val firstName: String) {

    // this is a function with an expression body
    // it just returns firstName.toUpperCase()
    fun upperCaseFirstName() = firstName.toUpperCase()
}