package com.swarnab;

public class SearchRotated {

    // Find Min Element in Rotated Sorted array
//    static int findMin(int[] arr, int start, int end) {
//        return arr[findPivot(arr, start, end) + 1];
//    }

    static int findPivot(int[] arr, int start, int end) {

        while(start < end) {
            int mid = start + (end - start) / 2;

            // CASE 1 : Middle element is pivot
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            if(mid > start && arr[mid - 1] > arr[mid]) {
                return mid - 1;
            }

            // CASE 2 :
            if (arr[start] >= arr[mid]) {
                end = mid - 1;

            // CASE 3 :
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }

    static int search(int[] arr, int pivot, int target, int start, int end) {
        if(pivot == -1) {
            return binarySearch(arr, target, start, end);
        }
        if(arr[pivot] == target) {
            return pivot;
        } else if (target >= arr[start]) {
            return binarySearch(arr, target, start, pivot-1);
        }
        else {
            return binarySearch(arr, target, pivot+1, end);
        }
    }

    static int binarySearch(int[] arr, int target, int start, int end) {

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

    public static void main(String[] args) {
        int[] arr = {2, 1};
        int target = 4;
        int start = 0;
        int end = arr.length - 1;

        int pivot = findPivot(arr, start, end);
        System.out.println(pivot);
        int index = search(arr, pivot, target, start, end);

        System.out.println("Element found at index " + index);

       // System.out.println(findMin(arr, start, end));
    }
}
