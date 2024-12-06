package com.swarnab;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {90, 75, 18, 12, 6, 4, 2, 1};
        int target = 4;

        System.out.println("Element found at index " + binary_search(arr, target));
    }

    static int binary_search(int[] arr, int target) {
        boolean isAscending = true;
        int start = 0;
        int end = arr.length - 1;

        if(arr[end] < arr[start])
            isAscending = false;
        else
            isAscending = true;

        while(start <= end) {
            int middle = start + (end - start) / 2;
            if(isAscending == true) {
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
            else {
                // search left
                if(arr[middle] < target)
                    end = middle - 1;

                    //  search right
                else if(arr[middle] > target)
                    start = middle + 1;

                    //  return mid
                else
                    return middle;
            }
        }
        return -1;
    }
}
