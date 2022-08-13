package _VQ;

import java.util.Scanner;

public class _VQ_2_OperationsOnNumbers {
    public static void main(String[] args) {
        // Input Class :-
        Scanner sc = new Scanner(System.in);

        // Taking Input from user :-
        System.out.print("Enter First Number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter Second Number : ");
        int num2 = sc.nextInt();

        // Initializing Operations :-
        int sum = num1 + num2;
        int product = num1 * num2;

        // Output :-
        System.out.println("\nSum :- " + sum);
        System.out.println("Product :- " + product);
    }
}
