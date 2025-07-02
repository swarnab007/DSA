package com.swarnab.strings;

import java.util.ArrayList;

public class Permutation {

    public static void permuations(String up, String p) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        for(int i=0; i<=p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            permuations(up.substring(1), first + ch + second);
        }
    }

    // Returning a List
    public static ArrayList<String> permutationList(String up, String p) {
        if(up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();
        char ch = up.charAt(0);
        for(int i=0; i<=p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            ans.addAll(permutationList(up.substring(1), first + ch + second));
        }
        return ans;
    }

    public static void main(String[] args) {
        String up = "abc";
        String p = "";
        // permuations(up, p);
        ArrayList<String> ans = new ArrayList<>();
        ans = permutationList(up, p);
        System.out.println(ans);
    }
}
