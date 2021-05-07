// Video 84
// Challenges for section 9

package udemy.kotlincourse.callkotlinfromjava;

import udemy.kotlincourse.kotlincode.Challenge;
import udemy.kotlincourse.kotlincode.EmployeeB;
import udemy.kotlincourse.kotlincode.KotlinStuff;

public class Main {

    public static void main(String[] args) {

        // Challenge 2 (change code in Kotlin to make this compile)
        KotlinStuff.sayHelloToJava("David");

        EmployeeB emp = new EmployeeB("Smitty", "Werbermanjensen", 2010);
        // emp.setStartYear(2009);  // without @JvmField annotation in Kotlin code
        emp.startYear = 2009;  // with @JvmField in the Kotlin code

        System.out.println(Challenge.doMath(5, 4));

        emp.takesDefault("arg1");

    }
}
