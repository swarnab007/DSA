package com.swarnab.strings;

public class SkipChar {
    public static String skipCharacters(String s, String answer) {
        // Base Case
        if(s.isEmpty()) {
            return answer;
        }
        if(s.charAt(0) == 'a')
        {
            return skipCharacters(s.substring(1), answer);
        }
        else {
            answer += s.charAt(0);
            return skipCharacters(s.substring(1), answer);
        }
    }

    public static void main(String[] args) {
        String s = "baccad";
        String answer = "";
        System.out.println(skipCharacters(s, answer));
    }
}
