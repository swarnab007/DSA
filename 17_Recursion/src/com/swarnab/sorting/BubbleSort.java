package com.swarnab.sorting;
import java.util.Arrays;
public class BubbleSort {

    public static void bubbleSort(int[] arr, int i, int j) {
        // Base Case
        if (i == arr.length - 1)
            return;
        if (j < arr.length - i - 1) {
            if (arr[j] > arr[j + 1]) {
                // Swap elements
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
            bubbleSort(arr, i, j + 1);
        } else {
            bubbleSort(arr, i + 1, 0);
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 4, 2};
        System.out.println("Array before sorting: " + Arrays.toString(arr));
        bubbleSort(arr, 0, 0); // Fix: Start with i = 0
        System.out.println("Array after sorting: " + Arrays.toString(arr));
    }
}