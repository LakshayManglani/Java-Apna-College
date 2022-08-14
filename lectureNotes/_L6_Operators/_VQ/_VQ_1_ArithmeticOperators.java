public class _VQ_1_ArithmeticOperators {
    public static void main(String[] args) {
        /*
         * Arithmetic Operators are of two types :-
         * 1) Binary :- Includes +, -, *, /, %
         * 2) Unary :- Includes ++, --
         */

        // 1) Binary Operators :-
        int a = 4;
        int b = 2;

        System.out.println("\nAddition(+) :- " + (a + b));
        System.out.println("\nSubtraciton(-) :- " + (a - b));
        System.out.println("\nMultiplication(*) :- " + (a * b));
        System.out.println("\nDivide(/) :- " + (a / b));
        System.out.println("\nRemainder(%) Or Modulo(%) :- " + (a % b));

        // 2) Unary Operators
        int price = 40;

        // First Use then Increase
        System.out.println("\n\n\nPrice in 2001 : " + (price++));

        // First Increase then Use
        System.out.println("\nPrice in 2009 : " + (++price));

        // First Use then Decrease
        System.out.println("\nPrice in 2009 : " + (price--));

        // First Decrease then Use
        System.out.println("\nPrice in 2001 : " + (--price));
        System.out.println();
    }
}
