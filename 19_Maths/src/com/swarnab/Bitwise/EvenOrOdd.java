package com.swarnab.Bitwise;

public class EvenOrOdd {
    public static int checkOdd(int n) {
        return (n & 1);
    }

    public static void main(String[] args) {
        int n = 87;

        if(checkOdd(n) == 1)
            System.out.println("Odd Number");
        else
            System.out.println("Even Number");
    }
}
