package com.swarnab;

public class PrettyPrinting {
    public static void main(String[] args) {
        double a = 567.485753;
        System.out.printf("Formatted Value is : %.3f\n", a);

        // it also rounds off the value to closest integer
        System.out.printf("Value os pi is %.2f\n", Math.PI);

        System.out.printf("My name is %s and my title is %s", "swarnab", "Banerjee");
    }
}
