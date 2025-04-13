package com.swarnab.easy;

public class Steps {

    static int helper(int n, int count) {
        // Base Case
        if(n == 0)
            return count;
        if(n % 2 == 0) {
            count++;
            return helper(n / 2, count);
        }
        else {
          count++;
          return helper(n - 1, count);
        }
    }
    public static void main(String[] args) {
        int count = 0;
        int num = 123;
        System.out.println("The No of steps required are " + helper(num, count));
    }
}
