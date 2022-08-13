package _VQ;

import java.util.Scanner;

public class _VQ_3_AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking Input From User :-
        System.out.println("Enter radius :- ");
        float radius = sc.nextFloat();

        // Calculate Area of Circle :-
        float pi = 3.14f;
        float area = pi*radius*radius;// Area of Cirlce = pi*r^2

        //Output
        System.out.println("Area :- "+area);
    }
}
