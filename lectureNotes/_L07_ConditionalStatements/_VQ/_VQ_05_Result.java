package _VQ;

import java.util.Scanner;

public class _VQ_05_Result {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input Number from User
        System.out.print("\nEnter Marks :- ");
        int marks = sc.nextInt();

        // Output
        // This is Ternary Operator
        String result = (marks >= 33) ? "Pass" : "Fail";
        System.out.println("Result :- " + result);
    }
}
