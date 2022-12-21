package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println(ages.length);
        String[] surnames = new String[100500];
        System.out.println(surnames.length);
        float[] prices = new float[40];
        System.out.println(prices.length);

        String[] names = new String[4];
        names[0] = "John";
        names[1] = "Petr";
        names[2] = "Oleg";
        names[3] = "Ivan";
        for (String name : names) {
            System.out.println(name);
        }

     }
}
