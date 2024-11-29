package com.swarnab;

import java.util.ArrayList;
import java.util.Scanner;

public class Dynamic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // syntax
        ArrayList<Integer> list = new ArrayList<>(10);
//        list.add(10);
//        list.add(20);

        // list.set(0, 99);
        System.out.println("Taking input");
        for(int i=0; i<5; i++) {
            list.add(in.nextInt());
        }

        for(int i=0; i<5; i++) {
            System.out.println(list.get(i));        // Gets an item at given index
        }

        // check if an element is present or not
        System.out.println(list.contains(30));
        // list.clear();

        // Element at 2 will be removed
        list.remove(2);
    }
}
