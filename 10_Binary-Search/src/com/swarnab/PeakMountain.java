package com.swarnab;

// https://leetcode.com/problems/peak-index-in-a-mountain-array/

public class PeakMountain {
    public static void main(String[] args) {
        int[] arr = {0, 2, 1, 0, -1};
        int N = arr.length;

        System.out.println("Peak Element index in Mountain array is : " + findPeak(arr, N));
    }

    static int findPeak(int[] arr, int N) {
        int start = 0;
        int end = N - 1;
        while(start < end) {
            int middle = start + (end - start) / 2;

            if(arr[middle] < arr[middle + 1]) {
                // We are in increasing part -> We move right
                start = middle + 1;
            }
            else {
                // We are in decreasing part -> We move left middle can be or can not be answer
                end = middle;
            }
        }
        return start;
    }
}
