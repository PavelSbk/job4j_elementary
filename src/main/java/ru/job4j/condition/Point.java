package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double first = x2 - x1;
        double second = y2 - y1;
        double third = Math.pow(first, 2);
        double fourth = Math.pow(second, 2);
        double fifth = third + fourth;
        double rsl = Math.sqrt(fifth);
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(1, 2, 3, 5);
        System.out.println("result (1, 2) to (3, 5) " + result);
        double result2 = Point.distance(2, 3, 4, 9);
        System.out.println("result (2, 3) to (4, 9) " + result2);
        double result3 = Point.distance(3, 4, 5, 8);
        System.out.println("result (2, 3) to (4, 9) " + result3);

    }
}
