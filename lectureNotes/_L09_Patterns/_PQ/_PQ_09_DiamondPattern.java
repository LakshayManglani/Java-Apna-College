package _PQ;

public class _PQ_09_DiamondPattern {
    public static void main(String[] args) {
        int n = 4;

        System.out.println();
        // Upper Outer Loop For Row
        for (int i = 0; i < n; i++) {
            // Print Spaces
            for (int j = n - 1; j > i; j--) {
                System.out.print("  ");
            }

            // Print Stars
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Lower Outer Loop For Row
        for (int i = n; i > 0; i--) {
            // Print Spaces
            for (int j = n - 1; j >= i; j--) {
                System.out.print("  ");
            }

            // Print Stars
            for (int j = 0; j < i * 2 - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
