package _VQ;

import java.util.Scanner;

public class _VQ_4_PrintLargestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input Numbers From User
        System.out.print("\nEnter First Number :- ");
        int num1 = sc.nextInt();
        System.out.print("Enter Second Number :- ");
        int num2 = sc.nextInt();
        System.out.print("Enter Third Number :- ");
        int num3 = sc.nextInt();

        // Output
        System.out.println();
        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println(num1 + " is Largest");
            } else {
                System.out.println(num3 + " is Largest");
            }
        } else {
            if (num2 > num3) {
                System.out.println(num2 + " is Largest");
            } else {
                System.out.println(num3 + " is Largest");
            }
        }
        System.out.println();
    }
}
