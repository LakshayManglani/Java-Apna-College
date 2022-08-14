package _VQ;

import java.util.Scanner;

public class _VQ_2_SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input Number From User
        System.out.print("\nEnter N :- ");
        int number = sc.nextInt();
        int count = 0;
        int sum = 0;

        // Output
        while (count <= number) {
            sum += count;
            count++;
        }

        System.out.println("Sum :- " + sum);
    }
}
