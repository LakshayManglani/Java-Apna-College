package _PQ;

import java.util.Scanner;

public class _PQ_3_Bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input Price from user
        System.out.print("Enter Pencil Price :- ");
        float pencil = sc.nextFloat();
        System.out.print("Enter Pen Price :- ");
        float pen = sc.nextFloat();
        System.out.print("Enter Eraser Price :- ");
        float eraser = sc.nextFloat();

        // Initialzing Bill
        float total = pencil + pen + eraser;
        float finalBill = total + total * 18 / 100;

        // Output
        System.out.println("Bill :- " + finalBill);
        System.out.println();
    }
}
