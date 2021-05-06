// Video 82

package udemy.kotlincourse.callkotlinfromjava;

import udemy.kotlincourse.kotlincode.CarKt;
import udemy.kotlincourse.kotlincode.StaticCar;

import static udemy.kotlincourse.kotlincode.StaticCar.*;

public class Main {

    public static void main(String[] args) {
        // how do we call topLevel() in Car.kt?
        topLevel();  // if we imported it
        StaticCar.topLevel();  // if we didn't import it

        System.out.println(getTestcapitalization());
        System.out.println(getTestCapitalization());

        System.out.println(letJavaAccessWithoutGetter);


        // extension functions
//      "print this Java String".printSpecial();  // we can't use extension functions like we do in Kotlin
        StaticCar.printSpecial("print this Java String");


        // setters and getters
        CarKt car = new CarKt("blue", "toyota", 2008);

        // proof that Kotlin generate setters and getters automatically
        // we never defined a "getModel(), setModel()" etc.. in Kotlin
        String model = car.getModel();
        car.setColor("navy blue");
        System.out.println(car.getColor());

    }

    public static void line() {
        System.out.println("---------------------");
    }
}
