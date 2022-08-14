package _VQ;

public class _VQ_4_CharacterPattern {
    public static void main(String[] args) {
        int n = 4;
        char character = 'A';

        System.out.println();
        // Outer Loop For Row
        for (int i = 0; i < n; i++) {
            // Inner Loop For Column
            for (int j = 0; j < i + 1; j++) {
                System.out.print(character++);
            }
            System.out.println();
        }
        System.out.println();
    }
}
