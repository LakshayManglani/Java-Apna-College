package _PQ;

import java.util.Scanner;

public class _PQ_5_LeapYearChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input Year From User
        System.out.print("\nEnter Year :- ");
        int year = sc.nextInt();

        // Output
        boolean a = year % 4 == 0;
        boolean b = year % 100 != 0;
        boolean c = year % 400 == 0;

        System.out.println();
        if (a && (b || c)) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }
        System.out.println();
    }
}
