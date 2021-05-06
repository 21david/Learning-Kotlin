package udemy.kotlincourse.section09.javacode;

public class AJavaClass {

    /******************************/
    // How does Object in Java work with Kotlin?
    // They get converted to "Any!" in Kotlin
    // we can cast back to java.lang.Object if we want to
    // from within our Kotlin code

    private Object anObject = new Object();

    public Object getAnObject() {
        return anObject;
    }

    public void setAnObject(Object anObject) {
        this.anObject = anObject;
    }
    /*******************************/

    /*******************************/
    // Static stuff in Java
    public static int x = 5;

    public static String xString() {
        return "This is x: " + x++;
    }
    /*******************************/


    /*******************************/
    // 13:11 in video 81

    public void demoMethod1() {
        // this is how we can create a thread with the Runnable interface
        // (an even longer way would be to create a whole class that implements Runnable,
        // then create an object of it, then pass that object in to the Thread constructor.)
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("I'm in a thread!");

            }
        }).start();
    }

    public void demoMethod2() {
        // Runnable is a SAM interface - "Single Abstract Method" interface
        // When a Java interface only has 1 abstract method, we can take shortcuts.
        // we can use a lambda instead of creating an anonymous object that
        // implements the method, and it will be equivalent
        new Thread( () -> System.out.println("I'm in a thread!") ).start();
    }

    // Since Runnable is a SAM interface, we can takea shortcut
    // when we call this method from Kotlin - we can just pass in a function
    public void demoMethod3(Runnable r) {
        new Thread(r).start();
    }
    /*******************************/

    // variable args
    public int max(int... numbers) {
        if(numbers.length == 0)
            return 0;

        int max = numbers[1];

        for(int i = 1; i < numbers.length; i++)
            if(numbers[i] > max)
                max = numbers[i];

        return max;
    }

    // variable args (with 1 required arg)
    public int maxWithGreeting(String name, int... numbers) {
        System.out.println("Wassup " + name + "!");

        if(numbers.length == 0)
            return 0;

        int max = numbers[1];

        for(int i = 1; i < numbers.length; i++)
            if(numbers[i] > max)
                max = numbers[i];

        return max;
    }


}
