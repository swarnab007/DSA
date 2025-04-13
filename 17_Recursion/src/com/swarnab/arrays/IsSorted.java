package com.swarnab.arrays;

public class IsSorted {
    // Search a single index
    static boolean checkSorted(int[] arr, int index) {
        if(index == arr.length - 1)
            return true;
        if(arr[index] < arr[index - 1])
            return false;
        return checkSorted(arr, index+1);
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 1, 23};
        if(checkSorted(arr, 1)) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }
    }
}
