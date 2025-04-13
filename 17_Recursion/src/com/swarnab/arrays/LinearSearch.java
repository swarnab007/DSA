package com.swarnab.arrays;

public class LinearSearch {

    static int linearSearch(int[] arr, int index, int target) {
        // BASE CASE
        if(index == arr.length - 1)
            return -1;
        if(arr[index] == target)
            return index;
        return linearSearch(arr, index+1, target);
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 18, 9};
        int target = 18;
        int index = linearSearch(arr, 0, target);
        if(index == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index " + index);
    }
}
