package com.swarnab.sorting;

import java.util.Arrays;

public class MergeSort {

    public static int[] merge(int[] first, int[] second) {
        int i = 0, j = 0;
        int k = 0;
        int[] mergedArr = new int[first.length + second.length];

        // Merge both arrays while both have elements
        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mergedArr[k++] = first[i++];
            } else {
                mergedArr[k++] = second[j++];
            }
        }

        // Copy remaining elements of first[] if any
        while (i < first.length) {
            mergedArr[k++] = first[i++];
        }

        // Copy remaining elements of second[] if any
        while (j < second.length) {
            mergedArr[k++] = second[j++];
        }

        return mergedArr;
    }

    public static int[] divide(int[] arr) {
        // BASE CASE
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;

        // Divide the parts recursively
        int[] left = divide(Arrays.copyOfRange(arr, 0, mid));
        int[] right = divide(Arrays.copyOfRange(arr, mid, arr.length));

        // Merge the first part and second part
        return merge(left, right);
    }

    public static void main(String[] args) {
        int arr[] = {2, 1, 6, 9, 34};
        System.out.println("Before Sorting array is " + Arrays.toString(arr));
        System.out.println("After Sorting array is " + Arrays.toString(divide(arr)));
    }
}