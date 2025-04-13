package com.swarnab.easy;

public class Nto1 {

    // N to 1
    static void func(int n) {
        // Base Case
        if(n == 0)
            return;

        System.out.println(n);

        func(n - 1);

    }

    // 1 to N
    static void func2(int n) {
        // Base Case
        if(n == 0)
            return;

        func2(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        // func(5);
        func2(5);
    }
}
