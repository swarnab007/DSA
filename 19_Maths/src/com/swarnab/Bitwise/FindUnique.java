package com.swarnab.Bitwise;

public class FindUnique {

    public static int unique(int[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans = ans ^ arr[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {2, 5, 7, 5, 2};
        System.out.println("The Unique element is : " + unique(arr));
    }
}
