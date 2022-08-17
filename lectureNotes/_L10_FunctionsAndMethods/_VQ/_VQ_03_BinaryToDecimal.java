package _VQ;

import java.util.Scanner;

public class _VQ_03_BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input Binary Number From User
        System.out.print("\nEnter Binary Number :- ");
        int binary = sc.nextInt();

        // Output
        System.out.println();
        binToDec(binary);
        System.out.println();
    }

    // Change Binary To Decimal
    public static void binToDec(int binary) {
        int decimal = 0;
        int count = 0;

        while (binary != 0) {
            int lastDigit = binary % 10;
            decimal += lastDigit * (int) Math.pow(2, count);
            count++;
            binary /= 10;
        }

        System.out.println(decimal);
    }
}
