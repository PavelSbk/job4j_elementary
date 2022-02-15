package ru.job4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        System.out.println();
        int[][] numbersTwo = {{1}, {2, 3}, {4, 5, 6}, {7, 8, 9, 10}};
        for (int i = 0; i < numbersTwo.length; i++) {
            System.out.println("Размер вложенного массива с индексом " + i
                    + " равен: " + numbersTwo[i].length);
        }
    }
}

