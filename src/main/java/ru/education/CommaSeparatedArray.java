package ru.education;

import java.util.Arrays;

public class CommaSeparatedArray {

        private int[] myArray;

    public CommaSeparatedArray(int[] myArrayp) {
        myArray = myArrayp;
    }

    public void print() {

        Arrays.stream(myArray).forEach(System.out::println);
    }

}