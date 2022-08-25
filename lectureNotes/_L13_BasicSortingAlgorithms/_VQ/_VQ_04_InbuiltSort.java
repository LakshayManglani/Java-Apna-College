package _VQ;

// For using array Sorting
import java.util.Arrays;

import java.util.Collections;

public class _VQ_04_InbuiltSort {
    public static void main(String[] args) {
        // 01
        // Inbuilt Sort
        int unsortedArray[] = { 5, 4, 1, 2, 3 };
        Arrays.sort(unsortedArray);
        System.out.print("\nSorted in Ascending Order : ");
        printArray(unsortedArray);

        // 02
        // For Sorting the array from start to end
        int unsortedArray_1[] = { 5, 4, 1, 2, 3 };

        Arrays.sort(unsortedArray_1, 0, 3);

        System.out.print("\nSorted form 0 to 2 : ");
        printArray(unsortedArray_1);

        // 03
        // For sort the array in Reverse Order

        // This array is an object of type Integer
        Integer unsortedArray_2[] = { 5, 4, 1, 2, 3 };// Object

        // reverseOrder Function works on Object Type Data
        Arrays.sort(unsortedArray_2, Collections.reverseOrder());

        System.out.print("\nSorted in Descending Order : ");
        printArray(unsortedArray_2);
    }

    // Print Array
    public static void printArray(int array[]) {
        System.out.print("( " + array[0]);
        for (int k = 1; k < array.length; k++) {
            System.out.print(", " + array[k]);
        }
        System.out.println(" )\n");
    }

    // Print Object Array
    public static void printArray(Integer array[]) {
        System.out.print("( " + array[0]);
        for (int k = 1; k < array.length; k++) {
            System.out.print(", " + array[k]);
        }
        System.out.println(" )\n");
    }

    // Compare in Java for array
    public static int Compare(int a, int b) {
        // a>b : +ve
        // a == b : 0
        // a <b : -ve

        // For Ascending
        // return a - b;

        // For Descending
        // return b - a;

        return 0;
    }
}
