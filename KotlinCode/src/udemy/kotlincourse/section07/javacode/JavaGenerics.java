package udemy.kotlincourse.section07.javacode;

import java.util.ArrayList;
import java.util.List;

public class JavaGenerics {
    public static void main(String[] args) {
        List<String> strings = new ArrayList();
        strings.add("Hello");

        // can't use generics with instanceof
        // boolean b = strings instanceof List<String>;


         boolean b = strings instanceof List;
    }
}
