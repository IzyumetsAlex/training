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

        if (myValue == null || myValue.length == 0) {
            throw new IllegalArgumentException("Нет данных для обработки");
            //System.out.println("Отсутствуют данные для вывода.");
            //return;
        }

        int minValue = Integer.MAX_VALUE;
        for(int num : myValue) {
            if(num < minValue) {
                minValue = num;
            }
        }
        return minValue;
    }
    public int findMax() {

        if (myValue == null || myValue.length == 0) {
            throw new IllegalArgumentException("Нет данных для обработки");
            //System.out.println("Отсутствуют данные для вывода.");
            //return;
        }

        int maxValue = Integer.MIN_VALUE;
        for(int num : myValue) {
            if(num > maxValue) {
                maxValue = num;
            }
        }
        return maxValue;
    }
    public int calculateAverage() {

        if (myValue == null || myValue.length == 0) {
            throw new IllegalArgumentException("Нет данных для обработки");
            //System.out.println("Отсутствуют данные для вывода.");
            //return;
        }

        int sum = 0;
        for(int num : myValue) {
            sum += num;
        }
        return sum / myValue.length;
    }
}

