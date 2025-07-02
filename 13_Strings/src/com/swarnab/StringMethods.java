package com.swarnab;

public class StringMethods {
    public static void main(String[] args) {
        String str = "Swarnab Banerjee";

        System.out.println(str.length());

        System.out.println(str.toUpperCase());

        // Removes the Spaces from front and rear
        System.out.println(str.trim());

        // Returns the character at a particular index
        System.out.println(str.charAt(6));      // -> b

        System.out.println(str.indexOf('a', 'B'));
    }
}
