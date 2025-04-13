package com.swarnab.easy;

public class Concept {

    static void concept(int n) {
        // Base Case
        if(n == 0)
            return;
        System.out.println(n);
        // This will cause infinite recursion
        // concept(n--);
        concept(--n);
    }

    public static void main(String[] args) {
        concept(5);
    }
}
