package com.swarnab.strings;
// Skip apple

public class SkipStr {
    public static String skipString(String s) {
        // Base Case
        if(s.isEmpty()) {
            return "";
        }
        if(s.startsWith("apple"))
        {
            return skipString(s.substring(5));
        }
        else {
            return s.charAt(0) + skipString(s.substring(1));
        }
    }

    public static void main(String[] args) {
        String s = "bacapplecad";
        System.out.println(skipString(s));
    }
}
