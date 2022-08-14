package _PQ;

import java.util.Scanner;

public class _PQ_1_PrintSumOfEvenOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input Number From User
        System.out.print("\nEnter Number :- ");
        int num = sc.nextInt();

        // Initializing variables
        int value;
        int totalOfEven = 0;
        int totalOfOdd = 0;

        // Working
        while (num != 0) {
            value = num % 10;
            if (value % 2 == 0) {
                totalOfEven += value;
            } else {
                totalOfOdd += value;
            }
            num /= 10;
        }

        // Output
        System.out.println("Total Of Even :- " + totalOfEven);
        System.out.println("Total Of Odd :- " + totalOfOdd);
    }
}
