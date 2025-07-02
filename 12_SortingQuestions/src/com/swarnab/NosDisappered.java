package com.swarnab;

import java.util.ArrayList;
import java.util.List;

public class NosDisappered {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        int N = arr.length; // Instead of hardcoding, use arr.length
        System.out.println("Missing Part is: " + findDisappearedNumbers(arr, N));
    }

    static List<Integer> findDisappearedNumbers(int[] nums, int N) {
        ArrayList<Integer> result = new ArrayList<>();

        int index = 0;
        while (index < N) {
            int correctIndex = nums[index] - 1;

            // Swap only if the number is in the valid range and not already in the correct position
            if (nums[index] != nums[correctIndex]) {
                swap(nums, index, correctIndex);
            } else {
                index++;
            }
        }

        // Finding missing numbers
        for (int i = 0; i < N; i++) {
            if (nums[i] != i + 1) {
                result.add(i + 1);
            }
        }

        return result;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
