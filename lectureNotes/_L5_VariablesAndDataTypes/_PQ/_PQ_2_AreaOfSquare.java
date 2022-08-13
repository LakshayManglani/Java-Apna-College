package _PQ;

import java.util.Scanner;

public class _PQ_2_AreaOfSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input Side from user
        System.out.println("Enter Side :-");
        int side = sc.nextInt();

        // Initializing Area of Square
        int area = side * side;

        // Output
        System.out.println("Area Of Square :- "+area);
    }
}
