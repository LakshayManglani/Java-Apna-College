package _PQ;

public class _PQ_1_HollowRectangle {
    public static void main(String[] args) {
        int n = 4;

        System.out.println();
        // Outer Loop For Row
        for (int i = 0; i < 4; i++) {
            // Inner Loop For Column
            for (int j = 0; j < n + 1; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
