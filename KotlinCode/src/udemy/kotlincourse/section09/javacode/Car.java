// Video 80

package udemy.kotlincourse.section09.javacode;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;


public class Car {

    private String color;
    private String model;
    private int year;

    public Car(String color, String model, int year) {
        this.color = color;
        this.model = model;
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    // @NotNull is basically documentation saying we don't expect nulls here
    // however, if we try to set to null from java code, an IllegalArgument exception will be thrown
    // so I think this basically makes it an actual non-nullable type for Kotlin code
    // (even with @NotNull, it can still be set to null IN JAVA)
    public void setColor(@NotNull String color) {
        System.out.println("setColor(\"" + color + "\") in Java file was invoked.");
        this.color = color;
    }

    // this will return a "String?" in Kotlin
    // so we can only st to nullable type variable
    public @Nullable String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
