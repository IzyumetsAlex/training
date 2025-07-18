package ru.education;

import java.util.Arrays;

public class ValueFinder {

    private int[] myValue;

    public ValueFinder(int[] myValue) {
        this.myValue = myValue;

        //public ValueFinder(int[] myValue) {
        //myValue = myValuef;
        //}
    }
    public int findMin() {

        checkArray();

        int minValue = Integer.MAX_VALUE;
        for(int num : myValue) {
            if(num < minValue) {
                minValue = num;
            }
        }
        return minValue;
    }
    public int findMax() {

        checkArray();

        int maxValue = Integer.MIN_VALUE;
        for(int num : myValue) {
            if(num > maxValue) {
                maxValue = num;
            }
        }
        return maxValue;
    }
    public int calculateAverage() {

        checkArray();

        int sum = 0;
        for(int num : myValue) {
            sum += num;
        }
        return sum / myValue.length;
    }

    private void checkArray() {
        if (myValue == null || myValue.length == 0) {
            throw new IllegalArgumentException("Отсутствуют данные для вывода");
        }
    }
}

