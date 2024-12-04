package com.swarnab;

import java.util.Scanner;

public class Questions {
    private static void swapValues(int[] arr, int a, int b) {
        int temp = arr[b];
        arr[b] = arr[a];
        arr[a] = temp;
    }

    private static int findMax(int[] arr) {
        int maxi = Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > maxi)
                maxi = j;
        }
        return maxi;
    }

    private static void reverseArray(int[] arr) {
        int s = 0;
        int e = arr.length - 1;

        while(s <= e) {
            swapValues(arr, s, e);
            s++;
            e--;
        }
    }

    public static void main(String[] args) {
        int a, b;
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter an array:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

//        System.out.println("Enter the positions");
//        a = in.nextInt();
//        b = in.nextInt();

        // swapValues(arr, a, b);
        // System.out.print("After swapping the array is ");
//        for(int i : arr) {
//            System.out.print(i + " ");
//        }

//        System.out.println("Maximum element in the array is : " + findMax(arr));

        System.out.println("After reversal the array is : ");
        reverseArray(arr);
        for(int i : arr) {
            System.out.print(i + " ");
        }
    }
}
