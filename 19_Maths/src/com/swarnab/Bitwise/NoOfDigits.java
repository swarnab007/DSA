package com.swarnab.Bitwise;

public class NoOfDigits {
    public static void main(String[] args) {
        int number = 10000;
        int base = 10;

        // Edge Case : number == 0
        int ans = (int) (Math.log(number) / Math.log(base) + 1);
        if(number == 0) ans = 0;

        System.out.println("The No of Digits in " + number + " of base " + base + " is " + ans);
    }
}
