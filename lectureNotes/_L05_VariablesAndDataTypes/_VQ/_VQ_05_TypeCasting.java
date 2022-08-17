public class _VQ_05_TypeCasting {
    public static void main(String[] args) {
        /*
         * Type Casting is done manually and forcefully.
         * For eg :- Changing float to int
         * Note :- Type Casting may have data loss chances.
         */

        float pi = 3.14f;
        int radius = (int) pi;// radius = 3; Loss of 0.14

        System.out.println("\npi :- " + pi);
        System.out.println("radius :- " + radius);
        System.out.println();
    }
}
