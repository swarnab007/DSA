package com.swarnab;

public class Overload {
    public static void main(String[] args) {
//        demo(3);
//        demo("hello");
        System.out.println( demo(4, 5, 6));

    }
    static void demo(int a) {
        System.out.println(a);
    }
    static void demo(String s) {
        System.out.println(s);
    }
    static int demo(int a, int b, int c) {
        return a + b + c;
    }
    // Error
//    static void demo(int a, int b, int c) {
//        System.out.println(a+b+c);
//    }
}
