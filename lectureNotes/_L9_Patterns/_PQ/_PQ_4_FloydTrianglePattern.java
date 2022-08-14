package _PQ;

public class _PQ_4_FloydTrianglePattern {
    public static void main(String[] args) {
        int n = 5;
        int count = 1;

        System.out.println();
        // Outer Loop For Row
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((count++) + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
