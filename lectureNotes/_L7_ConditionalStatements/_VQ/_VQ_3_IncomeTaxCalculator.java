package _VQ;

import java.util.Scanner;

public class _VQ_3_IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input Number From User
        System.out.print("\nEnter income :- ");
        int income = sc.nextInt();

        // Output
        System.out.println();
        if (income < 500000) {
            System.out.println("Income Tax(0%) :- 0");
        } else if (income <= 1000000) {
            System.out.println("Income Tax(20%) :- " + (income * 20 / 100));
        } else {
            System.out.println("Income Tax(30%) :- " + (income * 30 / 100));
        }
        System.out.println();
    }
}