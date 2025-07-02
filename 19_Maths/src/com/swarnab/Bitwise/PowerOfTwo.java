package com.swarnab.Bitwise;

public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 32;

        if(n == 0 ) System.out.println("Exception");
        if((n & (n - 1)) == 0)
            System.out.println(n + " is a Power of 2");
        else
            System.out.println(n + " is not a Power of 2");
    }
}
