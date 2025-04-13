package com.swarnab.easy;

public class Fact {

    static int fact(int n) {
        // Base Case
        if(n == 0 || n == 1)
            return 1;

        // Recurrence Relation
        return fact(n - 1) * n;
    }

    public static void main(String[] args) {
        int N = 50;
        System.out.println("Factorial of " + N + " is = " + fact(N));
    }
}
