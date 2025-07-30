package ru.education;

public class ArraysUtils {
    private int[] array;
    public ArraysUtils(int[] array) {
        this.array = array;
    }

    public int findMin() {
        checkArray(array);

        int minValue = Integer.MAX_VALUE;
        for (int num : array) {
            if (num < minValue) {
                minValue = num;
            }
        }
        return minValue;
    }

    public static int findMax(int[] values) {
        checkArray(values);

        int maxValue = Integer.MIN_VALUE;
        for (int num : values) {
            if (num > maxValue) {
                maxValue = num;
            }
        }
        return maxValue;
    }

    public static double calculateAverage(int[] values) {
        checkArray(values);

        long sum = 0L;
        for (int num : values) {
            sum += num;
        }
        return (double)sum / values.length;
    }

    public static void print(int[] array) {
        checkArray(array);

        for (int i = 0; i < array.length; i++) {
            if(i != 0) {
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }
    }
    private static void checkArray(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Отсутствуют данные для обработки.");
        }
    }

}