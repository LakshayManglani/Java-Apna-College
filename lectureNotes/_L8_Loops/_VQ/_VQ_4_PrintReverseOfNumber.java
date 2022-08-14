package _VQ;

import java.util.Scanner;

public class _VQ_4_PrintReverseOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input Number From User
        System.out.print("\nEnter Number :- ");
        int num = sc.nextInt();

        // Output
        int reverse = 0;

        System.out.println();
        while (num != 0) {
            int lastDigit = num % 10;
            reverse = (reverse * 10) + lastDigit;
            num /= 10;
        }
        System.out.println(reverse + "\n");
    }
}
