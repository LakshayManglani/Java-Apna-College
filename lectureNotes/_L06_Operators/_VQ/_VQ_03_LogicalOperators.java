public class _VQ_03_LogicalOperators {
    public static void main(String[] args) {
        // Logical :- Include &&, ||, !
        int a = 4;
        int b = 5;

        System.out.println();
        System.out.println((a == b) && (a < b));// False
        System.out.println((a == b) || (a < b));// True
        System.out.println(!(a < b));// False
        System.out.println();
    }
}
