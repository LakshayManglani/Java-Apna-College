package _PQ;

public class _PQ_03_InvetedHalfNumberPyramid {
    public static void main(String[] args) {
        int n = 5;

        System.out.println();
        // Outer Loop For Row
        for (int i = n; i > 0; i--) {
            // Inner Loop For Coloumn
            for (int j = 0; j < i; j++) {
                System.out.print((j + 1) + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
