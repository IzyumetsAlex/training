package ru.education;

import java.util.Arrays;

public class CommaSeparatedArray {


    private int[] myArray;

    public CommaSeparatedArray(int[] myArrayp) {
        myArray = myArrayp;
    }

    public void print() {

        if(myArray==null || myArray.length == 0) {
            System.out.println("Отсутствуют данные для вывода.");
            return; // выйти из метода
        }

        //System.out.print(myArray[0]);
        //if (myArray != null && myArray.length > 0) {

            for (int i = 0; i < myArray.length; i++) {
                if (i != 0) {
                    System.out.print(", ");
                }
                System.out.print(myArray[i]);
            }
        //} else if (myArray == null) {
        //    System.out.println("Отсутствуют данные для вывода, null");
        //} else {
        //    System.out.println("Отсутствуют данные для вывода");
        //}
    }
}