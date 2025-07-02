package com.swarnab;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 4};
        int N = 5;

        System.out.println("Array before sorting : " + Arrays.toString(arr));
        cycle(arr, 5);
        System.out.println("Array after sorting : " + Arrays.toString(arr));
    }

    static void cycle(int[] arr, int N) {
        int i=0;

        while(i < N) {
            if(arr[i] != i + 1) {
                swap(arr, i, arr[i] - 1);
            }
            else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}