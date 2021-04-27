package udemy.kotlincourse.javacode;

public class DummyClass {

    public String isVacationTime(boolean onVacation) {
        return onVacation ? "I'm on vacation" : "I'm working";
    }

    public String isVacationTime2(Boolean onVacation) {
        return onVacation ? "I'm on vacation" : "I'm working";
    }

    public void printNumbers(int[] numbers) {
        for(int number : numbers)
            System.out.print(number + " ");
        System.out.println();
    }
}
