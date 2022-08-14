package _VQ;

import java.util.Scanner;

public class _VQ_2_PrintEvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number from user
        System.out.print("\nEnter Number :- ");
        int num = sc.nextInt();

        // Output
        System.out.println();
        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        System.out.println();
    }
}
