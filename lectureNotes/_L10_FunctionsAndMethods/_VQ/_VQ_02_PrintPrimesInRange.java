package _VQ;

import java.util.Scanner;

public class _VQ_02_PrintPrimesInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input Range From User
        System.out.print("\nEnter Range :- ");
        int range = sc.nextInt();

        // Output
        System.out.println();
        for (int i = 0; i < range; i++) {
            printPrime(i);
        }
        System.out.println();
    }

    // Print Prime Numbers
    public static void printPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return;
            }
        }
        System.out.print(n + " ");
    }
}
