package com.swarnab;

import java.util.ArrayList;

public class Operator {
    public static void main(String[] args) {
        System.out.println("Swarnab" + "Banerjee");

        // the ASCII Values will be added
        System.out.println('s' + 'b');

        System.out.println((char)('a' + 1));

        System.out.println('a' + 1);

        System.out.println("a" + 2);

        System.out.println("Swarnab" + new ArrayList<>());

        // System.out.println(new ArrayList<>() + 6);   -> Error -> + used in Strings only
    }
}
