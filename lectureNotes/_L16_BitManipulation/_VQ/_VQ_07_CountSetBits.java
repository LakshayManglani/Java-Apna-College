package _VQ;

public class _VQ_07_CountSetBits {
    public static void main(String[] args) {
        countSetBits(10);
    }

    public static void countSetBits(int num) {
        int countBit = 0;
        while (num > 0) {
            if ((num & 1) != 0) {
                countBit++;
            }
            num = num >> 1;
        }
        System.out.println("\nSet Bit = " + countBit);
        System.out.println();
    }
}