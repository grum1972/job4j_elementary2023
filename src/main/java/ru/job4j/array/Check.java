package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean etalon = data[0];
        for (boolean datum : data) {
            if (datum != etalon) {
                return false;
            }
        }
        return true;
    }
}
