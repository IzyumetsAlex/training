package ru.education;

public class ArraysUtils {
    //private int[] array;
    public ArraysUtils(int[] array) {
        // this.array = array;
    }

    public static int findMin(int[] array) {
        checkArray(array);

        int minValue = Integer.MAX_VALUE;
        for (int num : array) {
            if (num < minValue) {
                minValue = num;
            }
        }
        return minValue;
    }

    public static int findMax(int[] array) {
        checkArray(array);

        int maxValue = Integer.MIN_VALUE;
        for (int num : array) {
            if (num > maxValue) {
                maxValue = num;
            }
        }
        return maxValue;
    }

    public static double calculateAverage(int[] array) {
        checkArray(array);

        long sum = 0L;
        for (int num : array) {
            sum += num;
        }
        return (double)sum / array.length;
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