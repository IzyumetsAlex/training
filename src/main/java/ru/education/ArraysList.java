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
        for (T listItem : list) {
                if (listItem.equals(element)) {
                list.remove(listItem);
            }
        }
    }

    public static <T> void addDuplicate(List<T> list, T elementDuplicate) {
        ListIterator<T> iterator = list.listIterator();
        while (iterator.hasNext()) {
            T item = iterator.next();
            if (item.equals(elementDuplicate)) {
                iterator.add(item);
            }
        }
        /* for (T listItem : list) {
            int index = list.indexOf(listItem);
            list.add(index + 1, listItem);
        }*/
    }

        static class Car {
            private final String brand;
            private final int yearOfProduction;

            public Car(String brand, int yearOfProduction) {
                this.brand = brand;
                this.yearOfProduction = yearOfProduction;
            }

            @Override
            public String toString() {
                return "[brand=" + brand + ", year=" + yearOfProduction + "]";
            }

            @Override
            public int hashCode() {
                return Objects.hash(brand, yearOfProduction);
            }

            @Override
            public boolean equals(Object o) {
                if(this==o) return true;
                if(getClass() != o.getClass()) return false;
                Car car = (Car) o;
                return brand.equals(car.brand) && yearOfProduction ==car.yearOfProduction;
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

        removeElement(uniqueCars, new Car("Audi", 2017));
        System.out.println("Список:" + uniqueCars);

        addDuplicate(uniqueCars, new Car("Tesla", 2020));
        System.out.println("Список с дублем:" + uniqueCars);
    }
}