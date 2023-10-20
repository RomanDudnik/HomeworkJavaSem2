package org.example;

/**
 * Написать функцию, возвращающую разницу между самым большим
 * и самым маленьким элементами переданного не пустого массива.
 */
public class Task2 {
    public static int minMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return max - min;
    }
}