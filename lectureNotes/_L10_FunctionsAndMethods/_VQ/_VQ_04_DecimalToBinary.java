package _VQ;

import java.util.Scanner;

public class _VQ_04_DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input Number From User
        System.out.print("\nEnter Number :-");
        int num = sc.nextInt();

        // Output
        System.out.println();
        decToBin(num);
        System.out.println();
    }

    // Decimal To Binary
    public static void decToBin(int num) {
        int binary = 0;
        int count = 0;

        while (num > 0) {
            int remainder = num % 2;
            binary += remainder * (int) Math.pow(10, count);
            count++;
            num /= 2;
        }

        System.out.println(binary);
    }
}
