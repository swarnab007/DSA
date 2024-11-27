package com.swarnab;

import java.util.Arrays;

public class Varargs {
    public static void main(String[] args) {
        // demo("swarnab", "rahul", "suraj");
        demo2(2, 4, 8, 10, 12);
    }

    // Error
//    static void demo1(String a, String ...v, String c) {
//
//    }

    static void demo2(int a, int b, int ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void demo(String ...s) {
        System.out.println(Arrays.toString(s));
    }
}
