package com.swarnab.easy;

public class Palindrome {
    static int sum = 0;
    static int reverseNo(int num) {
        if(num == 0) {
            return sum;
        }
        int digit = num % 10;
        sum = sum * 10 + digit;
        return reverseNo(num/10);
    }

    static boolean palindrome(int n) {
        if(n == reverseNo(n))  {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int num = 132319;
        if(palindrome(num))
            System.out.println(num + " is a Palindrome Number");
        else
            System.out.println(num + " is not a Palindrome Number");
    }
}
