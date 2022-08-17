package _PQ;

import java.util.Scanner;

public class _PQ_01_CheckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input Number From User
        System.out.print("\nEnter Number :- ");
        int num = sc.nextInt();

        // Output
        System.out.println();
        System.out.println((num >= 0) ? "Postive" : "Negative");
        System.out.println();
    }
}
