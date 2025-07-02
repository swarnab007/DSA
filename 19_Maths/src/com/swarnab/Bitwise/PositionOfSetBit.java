package com.swarnab.Bitwise;

public class PositionOfSetBit {
    public static int rightMostBit(int n) {
        if(n == 0) return -1;
        else {
            int count = 0;
            while (n != 0) {
                count++;
                n = n >> 1;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        int n = 8;
        System.out.println("The Position Of Rightmost Set Bit = " + rightMostBit(n));
    }
}
