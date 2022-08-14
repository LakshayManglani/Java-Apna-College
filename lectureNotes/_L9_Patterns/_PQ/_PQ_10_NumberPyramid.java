package _PQ;

public class _PQ_10_NumberPyramid {
    public static void main(String[] args) {
        int n = 5;

        System.out.println();
        // Outer Loop For Row
        for (int i = 0; i < n; i++) {
            // Print Spaces
            for (int j = i; j < n - 1; j++) {
                System.out.print(" ");
            }

            // Print Numbers
            for (int j = 0; j <= i; j++) {
                System.out.print((i + 1) + " ");
            }

            System.out.println();
        }
        System.out.println();
    }
}
