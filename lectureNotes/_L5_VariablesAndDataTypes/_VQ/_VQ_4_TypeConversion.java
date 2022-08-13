package _VQ;

public class _VQ_4_TypeConversion {
    public static void main(String[] args) {
        /*
         * Type Conversion is done by compiler automatically, when the criteria meets.
         * Criteria : -
         * 1) type compatible
         * type compatible list :- byte -> short -> int -> float -> long -> double.
         */

        int candyprice = 4;
        // Here integer variable changes it's data type by float
        float pricechange = candyprice;// pricechange = 4
        pricechange = candyprice + 0.45f;// pricechange = 4.45

        // Output
        System.out.println("\nPrice : "+pricechange+"\n");
    }
}
