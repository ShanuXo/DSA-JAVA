package Recursion;

import java.util.Scanner;

public class PrintName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // System.out.println("Displaying the Name 5 times");
        // Print(1, n);
        PrintNumber(1, n);
        System.out.println("Number in Reverse Order");
        PrintNumberRev(n, n);
    }

    static void Print(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.println("Shanu");
        Print(i + 1, n);
    }

    static void PrintNumber(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.println(i);
        PrintNumber(i + 1, n);

    }

    static void PrintNumberRev(int i, int n) {
        if (i < 1) {
            return;
        }
        System.out.println(i);
        PrintNumber(i - 1, n);

    }
}
