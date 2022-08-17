package _PQ;

import java.util.Scanner;

public class _PQ_02_CheckFever {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input Number From User
        System.out.print("\nEnter Temprature(in F) :- ");
        double temp = sc.nextDouble();

        // Output
        System.out.println();
        System.out.println((temp > 98.6) ? "Fever" : "Normal");
        System.out.println();
    }
}
