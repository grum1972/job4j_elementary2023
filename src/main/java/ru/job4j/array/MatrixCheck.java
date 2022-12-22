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

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        char etalon = board[0][column];
        for (int row = 1; row < board.length; row++) {
            if (board[row][column] != etalon) {
                result = false;
                break;
            }
        }
        return result;
    }
}
