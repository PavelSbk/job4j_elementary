package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double difAndDivision(double first, double second) {
        return difference(first, second)
                + division(first, second);
    }

    public static double sumOfAllMethods(double first, double second) {
        return sumAndMultiply(first, second)
                + difAndDivision(first, second);
    }

    public static void main(String[] args) {
        System.out.println(" Результат расчета (sum + mult) равен: " + sumAndMultiply(5, 10));
        System.out.println("  Результат расчета (dif + div) равен: " + difAndDivision(5, 10));
        System.out.println("Результат расчета (all methods) равен: " + sumOfAllMethods(5, 10));
    }
}
