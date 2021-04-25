package udemy.kotlincourse.section03

// Video 24

fun main(args: Array<String>) {

    // Raw strings, aka "triple quoted strings"
    // are used like this: """example"""

    // An example use for raw strings is with file paths
    // so that we don't have to use any escape sequences or anything
    val filePath = """c:\somedir\somedir2"""

    // Another example is multi-line strings
    // it will add line breaks for us (so we don't use "\n")
    val nurseryRhyme = """Humpty Dumpty sat on the wall
Humpty Dumpty had a great fall
All the kind's horses and all the king's men
Couldn't put Humpty together again."""

    println(nurseryRhyme)
    println()

    // .trimMargin() method can be used to indent, then take out the indentations
    // in the actual string
    val nurseryRhyme2 = """Humpty Dumpty sat on the wall
                          *Humpty Dumpty had a great fall
                          *All the kind's horses and all the king's men
                          *Couldn't put Humpty together again.""".trimMargin("*")

    println(nurseryRhyme2)
    println()

    // The default character used by .trimMargin() is the pipe -> |
    val nurseryRhyme3 = """Humpty Dumpty sat on the wall
                          |Humpty Dumpty had a great fall
                          |All the kind's horses and all the king's men
                          |Couldn't put Humpty together again.""".trimMargin()

    println(nurseryRhyme3)
    println()


    // You can still use $ syntax in triple quoted strings
    val name = "Superman"
    val nurseryRhyme4 = """$name sat on the wall
                          |$name had a great fall
                          |All the kind's horses and all the king's men
                          |Couldn't put $name together again.""".trimMargin()

    println(nurseryRhyme4)
}