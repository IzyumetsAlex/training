package ru.education;
import java.util.Arrays;

public class ValueFinder {

    private int[] myValue;

    public ValueFinder(int[] myValue) {
        //myValue = myValuef;

        if (myValue == null || myValue.length == 0) {
            System.out.println("Отсутствуют данные для вывода.");
            return; // выход из метода
        }

    }
}