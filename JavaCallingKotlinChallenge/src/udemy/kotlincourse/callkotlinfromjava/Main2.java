// Video 84
// Challenges for section 9

package udemy.kotlincourse.callkotlinfromjava;

import udemy.kotlincourse.kotlincode.*;

public class Main2 {

    public static void main(String[] args) {

        // Challenge 3 (change code right here to make this compile)
        KotlinCode2Kt.sayHelloToJava2("David");  // default class name is the name of the file with "Kt" at the end

        EmployeeC emp = new EmployeeC("Smitty", "Werbermanjensen", 2010);
        emp.setStartYear(2009);  // Kotlin generates .getStartYear() and .setStartYear() automatically

        System.out.println(Challenge2.INSTANCE.doMath(5, 4));  // use INSTANCE to access the one instance that exists


    }
}
