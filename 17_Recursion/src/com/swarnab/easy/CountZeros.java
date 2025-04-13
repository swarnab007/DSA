package com.swarnab.easy;

public class CountZeros {
    static int count = 0;
    static int reverseNo(int num) {
        if(num == 0) {
            return count;
        }
        int digit = num % 10;
        if (digit == 0) {
            count++;
        }
        return reverseNo(num/10);

    }

    public static void main(String[] args) {
        int num = 2040509;
        System.out.println("No of Zeroes in the number is " + reverseNo(num));
    }
}
