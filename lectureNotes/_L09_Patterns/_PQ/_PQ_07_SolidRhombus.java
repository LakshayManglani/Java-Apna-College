package _PQ;

public class _PQ_07_SolidRhombus {
    public static void main(String[] args) {
        int n = 5;

        System.out.println();
        // Outer Loop for Row
        for (int i = 0; i < n; i++) {
            // Print Spaces
            for (int j = n - 1; j > i; j--) {
                System.out.print("  ");
            }

            // Print Stars
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
        System.out.println();
    }
}
