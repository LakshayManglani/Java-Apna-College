package _VQ;

import java.util.Scanner;

public class _VQ_06_Calcultor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input operator From User
        int num1 = sc.nextInt();
        char operator = sc.next().charAt(0);
        int num2 = sc.nextInt();

        // Output
        System.out.print("= ");
        switch (operator) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
            case '%':
                System.out.println(num1 % num2);
                break;
            default:
                System.out.println("Wrong Operation");
                break;
        }
    }
}
