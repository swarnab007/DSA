package com.swarnab;

public class MaxConsecutiveOnes {

    // BRUTE FORCE  ->   O(N*N)
//    public static int maxLength(int[] nums, int k) {
//        // Generate all Subarrays
//        int maxLen = 0, len = 0;
//        for(int i=0; i<nums.length; i++) {
//            int zeros = 0;
//            for(int j=i; j<nums.length; j++) {
//                if(nums[j] == 0)
//                    zeros++;
//                if(zeros <= k) {
//                    len = j - i + 1;
//                    maxLen = Math.max(maxLen, len);
//                }
//                else
//                    break;
//            }
//        }
//        return maxLen;
//    }

    // Using Sliding Window Technique -> O(n)
    public static int maxLength(int[] nums, int k) {
        // Initialize Left and Right Pointer
        int maxLen = 0, len = 0, left = 0, right = 0, zeros = 0;
        while(right < nums.length) {
            // increase 0 count
            if(nums[right] == 0)
                zeros++;
            // if zeros becomes greater than K, move left
            while(zeros > k) {
                // if nums[left] == 0 reduce zeros
                if(nums[left] == 0)
                    zeros--;
                left++;
            }
            // Update maxlength
            if(zeros <= k) {
                len = right - left + 1;
                maxLen = Math.max(maxLen, len);
            }
            right++;
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int k = 2;
        System.out.println("Maximum Length is : " + maxLength(arr, k));
    }
}
