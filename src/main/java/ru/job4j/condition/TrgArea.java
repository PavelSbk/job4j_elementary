package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double p = (a + b + c) * 0.5;
        double mult = p * ((p - a) * (p - b) * (p - c));
        double area = Math.sqrt(mult);
        return area;
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(4, 5, 6);
        System.out.println("area (4, 5, 6) = " + rsl);
    }
}
