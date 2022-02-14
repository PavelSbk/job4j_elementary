package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = false;
        for (int i = 0, j = i + 1; j < data.length; i++, j++) {
            if (data[i] == data[j]) {
                result = true;
            } else {
                break;
            }
        }
        return result;
    }
}

