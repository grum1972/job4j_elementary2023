package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {

        if (name.isEmpty()) {
            return false;
        }
        boolean rsl = true;
        if (isLowerLatinLetter(name.charAt(0))) {
            for (int i = 1; i < name.length(); i++) {
                if (!(isSpecialSymbol(name.charAt(i))
                        || isUpperLatinLetter(name.charAt(i))
                        || isLowerLatinLetter(name.charAt(i))
                        || Character.isDigit(name.charAt(i)))) {
                    rsl = false;
                    break;
                }
            }
        } else {
            rsl = false;
        }
        return rsl;
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;

    }

    public static boolean isUpperLatinLetter(int code) {
        return code >= 65 && code <= 90;
    }

    public static boolean isLowerLatinLetter(int code) {
        return code >= 97 && code <= 122;
    }
}
