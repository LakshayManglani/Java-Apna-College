package _PQ;

public class _PQ_11_PalindromicPattern {
    public static void main(String[] args) {
        int n = 5;

        System.out.println();
        // Outer Loop For Row
        for (int i = 0; i < n; i++) {
            // Print Spaces
            for (int j = i; j < n - 1; j++) {
                System.out.print("  ");
            }

            // Print Numbers in Descending Order
            for (int j = i; j > 0; j--) {
                System.out.print((j + 1) + " ");
            }

            // Print Numbers in Ascending Order
            for (int j = 0; j <= i; j++) {
                System.out.print((j + 1) + " ");
            }

            System.out.println();
        }
        System.out.println();
    }
}
