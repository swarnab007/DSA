package com.swarnab.Bitwise;

public class IthBit {

    public static int findBit(int n, int i) {
        return (n >> i) & 1;
    }

    public static void main(String[] args) {
        int n = 29;
        int i = 3;
        System.out.println("The " + i + " bit of " + n + " is = " + findBit(n, i));
    }

    public static class NoOfDigits {
    }
}
