/**
 *  Java program to use build-in sorting algorithms.
 */

package com.mysort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Creating an array.
        int[] array = {1, 4, -3, 6, 5, 9, 2};

        // Printing original array.
        System.out.println("Original: " + Arrays.toString(array)); // Output: Original: [1, 4, -3, 6, 5, 9, 2]

        // Sorting the array.
        Arrays.sort(array);

        // Printing sorted array.
        System.out.println("Sorted: " + Arrays.toString(array)); // Output: Sorted: [-3, 1, 2, 4, 5, 6, 9]

        // Creating an ArrayList.
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(-7);
        list.add(4);
        list.add(2);
        list.add(1);
        list.add(-11);
        list.add(-8);
        list.add(-9);
        list.add(9);

        // Printing original ArrayList.
        System.out.println("Original list: " + list); // Output: Original list: [0, -7, 4, 2, 1, -11, -8, -9, 9]

        // Sorting ArrayList.
        Collections.sort(list);

        // Printing sorted ArrayList.
        System.out.println("Sorted list: " + list); // Output: Sorted list: [-11, -9, -8, -7, 0, 1, 2, 4, 9]

    }
}