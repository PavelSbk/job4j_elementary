package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int rsl = 1;
        for (int i = 0; i < n; i++) {
            rsl *= n - i;
        }
        return rsl;
    }
}
