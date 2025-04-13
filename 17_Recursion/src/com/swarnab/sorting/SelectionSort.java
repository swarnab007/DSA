package com.swarnab.sorting;

import java.util.Arrays;

public class SelectionSort {

    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    public static void selectionSort(int[] arr, int i) {
        // BASE CASE
        if(i == arr.length - 1)
            return;
        int last = arr.length - i - 1;
        // Find Correct index
        int correctIndex = getMaxIndex(arr, 0, last);
        // swap
        int temp = arr[correctIndex];
        arr[correctIndex] = arr[last];
        arr[last] = temp;
        selectionSort(arr, i+1);
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 4, 2};
        System.out.println("Array before sorting: " + Arrays.toString(arr));
        selectionSort(arr, 0); // Fix: Start with i = 0
        System.out.println("Array after sorting: " + Arrays.toString(arr));
    }
}
