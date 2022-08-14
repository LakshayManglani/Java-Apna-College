package _PQ;

public class _PQ_5_ZeroOneTrinagle {
    public static void main(String[] args) {
        int n = 5;

        System.out.println();
        // Outer Loop For Row
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
