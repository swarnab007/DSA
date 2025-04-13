package com.swarnab.patterns;

public class Triangle {

    // *
    // * *
    // * * *
    // * * * *
    public static void traingle2(int row, int col) {
        // Base Case
        if(row == 0)
            return;
        if(col < row) {
            traingle2(row, col + 1);
            System.out.print("*");
        }
        else {
            traingle2(row - 1, 0);
            System.out.println();
        }
    }

    // * * * *
    // * * *
    // * *
    // *
    public static void traingle(int row, int col) {
        // Base Case
        if(row == 0)
            return;
        if(col < row) {
            System.out.print("*");
            traingle(row, col + 1);
        }
        else {
            System.out.println();
            traingle(row - 1, 0);
        }
    }

    public static void main(String[] args) {
        traingle2(4, 0);
    }
}
