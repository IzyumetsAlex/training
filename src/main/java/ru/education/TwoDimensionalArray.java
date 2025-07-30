package ru.education;

public class TwoDimensionalArray {
    public static String joinStrings(String[][] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Недопустимая матрица");
        }
        int n = array.length;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result.append(array[i][j]);
            }
        }

        return result.toString();
    }
}

