package com.swarnab;

public class Comparison {
    public static void main(String[] args) {
        // a and b both pointing to same object
        String a = "swarnab";
        String b = "swarnab";
        String c = a;

        // it checks only the object not the reference variables
        System.out.println(a == c);            // -> true

        // using new keyword
        String s1 = new String("Sachin");
        String s2 = new String("Sachin");
        // s1 and s2 are two different objects
        // System.out.println(s1 == s2);       // -> false

        // only checks the value
        System.out.println(s1.equals(s2));  // -> true
        System.out.println(c.equals(b));    // -> true
    }
}
