package _VQ;

public class _VQ_03_OperationsOnBit {
    public static void main(String[] args) {
        getBit(5, 0);// This will give 0 of binary

        setBit(5, 1);// This will give 7 of decimal

        clearBit(10, 1);// This will give 8 of decimal
    }

    // This will give the bit of the given pos
    public static void getBit(int num, int pos) {
        int bitMask = 1 << pos;

        System.out.println();
        if ((bitMask & num) == 0) {
            System.out.println("0");
        } else {
            System.out.println("1");
        }
        System.out.println();
    }

    // This will convert the bit of given pos to 1 wheter it 0 or 1
    public static void setBit(int num, int pos) {
        System.out.println();
        int bitMask = 1 << pos;
        System.out.println((num | bitMask));
    }

    // This will convert the bit of given pos to 0 wheter it 0 or 1
    public static void clearBit(int num, int pos) {
        System.out.println();
        int bitMask = 1 << pos;
        System.out.println(num ^ bitMask);
    }

    // This will update the given pos with given binary number
    public static void updateBit(int num, int pos, int bit) {
        // 1st Way of doing this :-
        if (bit == 0) {
            clearBit(num, pos);
        } else {
            setBit(num, pos);
        }

        // // 2nd Way of doing this :-
        // // Note First make clearBit and updateBit function as Int type
        // num = clearBit(num, pos);
        // int bitMask = bit << pos;
        // return n | bitMask;
    }
}
