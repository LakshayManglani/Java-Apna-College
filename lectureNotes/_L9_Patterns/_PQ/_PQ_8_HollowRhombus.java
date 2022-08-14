package _PQ;

public class _PQ_8_HollowRhombus {
    public static void main(String[] args) {
        int n = 5;

        System.out.println();
        // Outer Loop for Row
        for (int i = 0; i < n; i++) {
            // Print Spaces
            for (int j = 4; j > i; j--) {
                System.out.print("  ");
            }

            // Print Hollow Rhombus
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                    // Print Stars
                    System.out.print("* ");
                } else {
                    // Print Spaces
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}
