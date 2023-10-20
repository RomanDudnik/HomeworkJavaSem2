package org.example;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        int array[] = {2, 1, 2, 3, 4, 0, 0};

        // Task1
        System.out.println("Четные элементы массива " + Arrays.toString(array) + ": " + Task1.countEvens(array));

        // Task2
        System.out.println("Разница между самым большим и самым маленьким элементами массива " + Arrays.toString(array)
                + ": " + Task2.minMax(array));

        // Task3
        int adjNum = 0;
        System.out.println("Есть два соседних элемента " + adjNum + ", в массиве: " + Arrays.toString(array) + " ? - "
                + Task3.hasTwoAdjacent(array, adjNum));
    }
}