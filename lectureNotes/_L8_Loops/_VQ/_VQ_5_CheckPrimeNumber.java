package _VQ;

import java.util.Scanner;

public class _VQ_5_CheckPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input Number From User
        System.out.print("\nEnter Number :- ");
        int num = sc.nextInt();

        // Output
        boolean isPrime = true;

        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a Prime Number");
        }
    }
}
