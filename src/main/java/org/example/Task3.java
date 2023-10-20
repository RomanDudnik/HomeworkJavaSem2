package org.example;

/**
 * Написать функцию, возвращающую истину,
 * если в переданном массиве есть два соседних элемента, с нулевым значением.
 */

public class Task3 {
    public static boolean hasTwoAdjacent(int[] arr, int adjNum) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == adjNum && arr[i + 1] == adjNum) {
                return true;
            }
        }
        return false;
    }
}

