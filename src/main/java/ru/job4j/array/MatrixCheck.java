package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        char etalon = board[row][0];
        for (int cell = 1; cell < board[row].length; cell++) {
            if (board[row][cell] != etalon) {
                result = false;
                break;
            }
        }
        return result;
    }
}
