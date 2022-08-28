package _VQ;

public class _VQ_05_ClearRangeOfBits {
    public static void main(String[] args) {
        System.out.println();
        clearRangeOfBits(10, 2, 4);
        System.out.println();
    }

    public static void clearRangeOfBits(int num, int pos1, int pos2) {
        int bitMaskA = (~0 << pos2 + 1);
        int bitMaskB = ~(-1 << pos1);
        int bitMask = bitMaskA | bitMaskB;

        // Output
        System.out.println(bitMask & num);
    }
}
