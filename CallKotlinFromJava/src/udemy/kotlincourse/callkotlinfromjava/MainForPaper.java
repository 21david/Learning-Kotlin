// Video 83

package udemy.kotlincourse.callkotlinfromjava;

import udemy.kotlincourse.kotlincode.Paper;
import udemy.kotlincourse.kotlincode.SingletonObj;

import java.io.IOException;

import static udemy.kotlincourse.callkotlinfromjava.Main.line;

public class MainForPaper {

    public static void main(String[] args)  {
        // companion objects
        Paper.Companion.paperComp();
        Paper.paperComp2(); // this uses the @JvmStatic annotation

        // variables
        System.out.println(Paper.Companion.isSquare());
        System.out.println(Paper.isSquare2);  // this uses the @JvmField annotation
        System.out.println(Paper.contant);

        line();

        /********************************/
        // singleton objects
        // INSTANCE refers to the single instance of the SingletonObj that is created
        SingletonObj.INSTANCE.doSomething();
        SingletonObj.doSomething2(); // this uses the @JvmStatic annotation


        /*********************************/
        // what if we send a null to a Kotlin function that doesn't accept nullable types?
//      Paper.Companion.printMe(null);  // it throws a IllegalArgumentException at runtime

        line();


        /*********************************/
        // what if we run a Kotlin function that may throw an exception?
//      Paper.Companion.doIO();  // we DON'T need to do anything special, but it can (and will) throw the exception

        // and we can't catch it if we wanted to
        /*
        try {
            Paper.Companion.doIO();
        }
        catch(IOException ex) {} // Exception 'java.io.IOException' is never thrown in the corresponding try
        */

        // if we annotate the Kotlin function with "@Throws(IOExcepption::class)"
        // then Java now knows it may throw that exception, and we need to do something to handle it
        // (declare 'throws IOException' in this method's signature, or put in try-catch block)
        try {
            Paper.Companion.doIOAnnotated();
        }
        catch(IOException ex) { System.out.println("oops"); }

        line();

        /*********************************/
        // Default parameters (14:20 in video 83)
        Paper.Companion.defaultArguments("The Number is: ", 40);
//      Paper.Companion.defaultArguments("The Number is: ");  // error because from Java, we need to pass both parameters in

        Paper.Companion.defaultArgumentsAnnotated("The Number is: ");  // no error, because we annotated it with @JvmOverloads

    }
}
