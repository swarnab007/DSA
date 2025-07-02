package com.swarnab;

public class SB {
    public static void main(String[] args) {
        // mutable object
        StringBuilder str = new StringBuilder();

        for(int i=0; i<26; i++) {
            char ch = (char)('a' + i);
            str.append(ch);
        }

        System.out.println(str);
    }
}
