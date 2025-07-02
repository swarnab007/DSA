package com.swarnab.Bitwise;

public class NoOfSetBits {
    public static void main(String[] args) {
        int n = 15;

        System.out.println("Binary = " + Integer.toBinaryString(n));
        int c = 0;
        while(n != 0) {
            c ++;
            n = (n & (n - 1));
        }
        System.out.println("No of Set Bits are = " + c);
    }
}
