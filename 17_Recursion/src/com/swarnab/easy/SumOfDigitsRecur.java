package com.swarnab.easy;

public class SumOfDigitsRecur {

    static int sumOfDigits(int N) {
        // Base Case
        if(N == 0)
            return 0;

        int digit = N % 10;
        // Recurrence Relation
        return digit + sumOfDigits(N / 10);
    }

    public static void main(String[] args) {
        int N = 1523;
        System.out.println("Sum Of Digits = " + sumOfDigits(N));
    }
}
