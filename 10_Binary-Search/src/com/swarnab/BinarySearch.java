package com.swarnab;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 8, 10, 23, 28, 48};
        int target = 48;

        int index = binarySearch(arr, target);

        if(index == -1) {
            System.out.println("Element not found");
        }
        else {
            System.out.println("Element found at index " + index);
        }
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int middle = start + (end - start) / 2;

            // search left
            if(arr[middle] > target)
                end = middle - 1;

            //  search right
            else if(arr[middle] < target)
                start = middle + 1;

            //  return mid
            else
                return middle;
        }
        // Element not found
        return -1;
    }
}
