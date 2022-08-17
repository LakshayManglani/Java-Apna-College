package _PQ;

import java.util.Scanner;

public class _PQ_03_PrintFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input Number From User
        System.out.print("\nEnter Number :- ");
        int num = sc.nextInt();

        // Initialzing Variables
        int factorial = 1;

        // Working
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        // Output
        System.out.println("Factorial :- " + factorial);
        System.out.println();
    }
}
