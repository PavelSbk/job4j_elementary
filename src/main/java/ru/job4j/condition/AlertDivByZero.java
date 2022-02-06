package ru.job4j.condition;

public class AlertDivByZero {

    public static void possibleDiv(int number) {
        if (number == 0) {
            System.out.println(number + " Could not div by 0.");
        } else if (number < 0) {
            System.out.println(number + " This is negative number");
        } else {
            System.out.println(number + " is a permissible value");
        }
    }

    public static void main(String[] args) {
        possibleDiv(4);
        possibleDiv(0);
        possibleDiv(-2);
    }
}
