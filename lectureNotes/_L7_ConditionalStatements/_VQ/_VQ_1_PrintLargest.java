package _VQ;

import java.util.Scanner;

public class _VQ_1_PrintLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input Numbers from User
        System.out.print("\nEnter First Number :- ");
        int num1 = sc.nextInt();
        System.out.print("Enter Second Number :- ");
        int num2 = sc.nextInt();

        // Output
        System.out.println();
        if (num1 > num2) {
            System.out.println(num1 + " is Greater");
        } else {
            System.out.println(num2 + " is Greater");
        }
        System.out.println();
    }
}
