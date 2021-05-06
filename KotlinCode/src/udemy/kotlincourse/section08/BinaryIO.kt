// Video 77

package udemy.kotlincourse.section08

import java.io.DataInputStream
import java.io.EOFException
import java.io.FileInputStream

fun main(args: Array<String>) {

    val di = DataInputStream(FileInputStream("testfile.bin"))
    var si: String

    try {
        while(true) {
            si = di.readUTF()
            println(si)
        }
    }
    catch(e: EOFException) {}


    // try with resources takes care of closing a resource for us
    // resources have to implement the "Closable" interface to work with it
    // the way this is done in Kotlin, though, is by using functions with 'use' in them
    // since they automatically close the resources when done with them

}

// writing files is mostly the same in Kotlin as in Java