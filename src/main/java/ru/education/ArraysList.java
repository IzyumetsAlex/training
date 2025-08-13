package ru.education;
import java.util.*;


public class ArraysList {

    public static <T> List<T> removeDuplicates(List<T> list) {
        return new ArrayList<>(new LinkedHashSet<>(list));
    }

    public static <T> int findIndex(List<T> list, T element) {
        return list.indexOf(element);
    }

    public static <T> void removeElement(List<T> list, T element) {

    }

    static class Car {
        private final String brand;
        private final int yearOfProduction;

        public Car(String brand, int yearOfProduction) {
            this.brand = brand;
            this.yearOfProduction = yearOfProduction;
        }

    }

    public static void main(String[] args) {
        List<Car> cars = Arrays.asList(
                new Car("Ford", 2010),
                new Car("BMW", 2015),
                new Car("Audi", 2017),
                new Car("BMW", 2015),
                new Car("Tesla", 2020)
        );

        List<Car> uniqueCars = removeDuplicates(cars);
        System.out.println("Очищенный список: " + uniqueCars);

        int index = findIndex(uniqueCars, new Car("Audi", 2017));
        System.out.println("Индекс Audi 2017: " + index);


    }
}