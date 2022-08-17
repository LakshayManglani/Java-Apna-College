package _PQ;

import java.util.Scanner;

public class _PQ_04_SumOfDigitsInInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input Number From User
        System.out.print("\nEnter Number :- ");
        int num = sc.nextInt();

        System.out.println();
        System.out.println(sumOfDigits(num));
        System.out.println();
    }

    // Calculate Sum OF Digits
    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            int lasDigit = num % 10;

            sum += lasDigit;

            num /= 10;
        }

        return sum;
    }

}
