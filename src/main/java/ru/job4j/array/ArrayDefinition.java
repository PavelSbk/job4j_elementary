package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surname = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        System.out.println("\nРазмер массива 'ages' равен: " + ages.length);
        System.out.println("Размер массива 'surname' равен: " + surname.length);
        System.out.println("Размер массива 'prices' равен: " + prices.length);
        System.out.println();
        names[0] = "Ivan Ivanov";
        names[1] = "Oleg Kozlov";
        names[2] = "Irina Ivanova";
        names[3] = "Olga Kozlova";
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}

