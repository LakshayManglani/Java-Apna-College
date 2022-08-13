package lectureNotes._L5_VariablesAndDataTypes._VQ;

public class _VQ_4_TypeCasting {
    public static void main(String[] args) {
        /*
         * Type Conversion is done by compiler automatically, when the criteria meets.
         * Criteria : -
         * 1) type compatible
         * type compatible list :- byte -> short -> int -> float -> long -> double.
         */

        //
        int candyprice = 4;
        float pricechange = candyprice;// pricechange = 4
        pricechange = candyprice + 0.45f;// pricechange = 4.45

        // Output
        System.out.println(pricechange);

    }
}
