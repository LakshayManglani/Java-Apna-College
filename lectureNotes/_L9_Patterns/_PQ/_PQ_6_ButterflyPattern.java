package _PQ;

public class _PQ_6_ButterflyPattern {
    public static void main(String[] args) {
        int n = 4;

        System.out.println();
        // Upper Outer Loop For Row
        for (int i = 0; i < n; i++) {
            // For Stars
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }

            // For Spaces
            for (int j = 0; j < ((n * 2) - 2) - (i * 2); j++) {
                System.out.print("  ");
            }

            // For Stars
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Lower Outer Loop For Row
        for (int i = n - 1; i >= 0; i--) {
            // For Stars
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }

            // For Spaces
            for (int j = 0; j < ((n * 2) - 2) - (i * 2); j++) {
                System.out.print("  ");
            }

            // For Stars
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
