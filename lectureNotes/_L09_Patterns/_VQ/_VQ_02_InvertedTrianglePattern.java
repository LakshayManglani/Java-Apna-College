package _VQ;

public class _VQ_02_InvertedTrianglePattern {
    public static void main(String[] args) {
        int n = 4;

        System.out.println();
        // Outer Loop For Row
        for (int i = n; i > 0; i--) {
            // Inner Loop For Column
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
