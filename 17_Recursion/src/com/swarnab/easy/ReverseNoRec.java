package com.swarnab.easy;

public class ReverseNoRec {

    static void reverseNo(int num) {
        int sum = 0;
        if(num == 0) {
            return;
        }
        int digit = num % 10;
        sum = sum * 10 + digit;
        System.out.print(sum);
        reverseNo(num/10);
    }

    public static void main(String[] args) {
        reverseNo(2345);
    }
}
