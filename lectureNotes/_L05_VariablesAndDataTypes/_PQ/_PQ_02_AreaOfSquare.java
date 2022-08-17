import java.util.Scanner;

public class _PQ_02_AreaOfSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input Side from user
        System.out.print("\nEnter Side :-");
        int side = sc.nextInt();

        // Initializing Area of Square
        int area = side * side;

        // Output
        System.out.println("Area Of Square :- "+area);
        System.out.println();
    }
}
