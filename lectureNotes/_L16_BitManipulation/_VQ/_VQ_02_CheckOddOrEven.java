package _VQ;

public class _VQ_02_CheckOddOrEven {
    public static void main(String[] args) {
        checkEvenOrOdd(2);
        checkEvenOrOdd(3);
        checkEvenOrOdd(4);
        checkEvenOrOdd(5);
    }

    public static void checkEvenOrOdd(int number) {
        int bitMask = 1;
        System.out.println();
        if ((number & bitMask) == 0) {
            System.out.println(number + " is Even Number");
        } else {
            System.out.println(number + " is Odd Number");
        }
        System.out.println();
    }
}
