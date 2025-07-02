package com.swarnab;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 4, 19};
        int num = 10;

        // Declaring a String
        String name = "Swarnab Banerjee";

        // Printing a string
        System.out.println(name);

        // String pool
        String a = "Ram";
        System.out.println(a);

        // immutable -> it will create a new String object named Rahim and a will point to that
        a = "Rahim";
        System.out.println(a);
    }
}