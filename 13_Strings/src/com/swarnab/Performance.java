package com.swarnab;

public class Performance {
    public static void main(String[] args) {
        String series = "";

        // Unoptimized -> Wastage of Memory and time inefficient
        for(int i=0; i<26; i++) {
            char ch = (char)('a' + i);
            series += ch;
        }

        System.out.println(series);
    }
}
