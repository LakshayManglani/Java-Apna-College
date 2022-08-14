package _PQ;

import java.util.Scanner;

public class _PQ_4_PrintTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input Number From User
        System.out.print("\nEnter Number :- ");
        int tableOF = sc.nextInt();

        // Working
        for (int i = 1; i <= 10; i++) {
            System.out.println(tableOF + " * " + i + " = " + (tableOF * i));
        }
        System.out.println();
    }
}
