package _VQ;

public class _VQ_04_ClearLastBit {
    public static void main(String[] args) {
        clearLastIthBit(15, 2);
    }

    public static void clearLastIthBit(int num, int pos) {
        // -1(decimal) = 11111111(binary)
        int bitMask = -1 << pos;
        System.out.println("\n" + (num & bitMask) + "\n");
    }
}
