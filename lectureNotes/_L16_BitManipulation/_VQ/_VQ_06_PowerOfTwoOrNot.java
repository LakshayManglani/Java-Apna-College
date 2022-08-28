package _VQ;

public class _VQ_06_PowerOfTwoOrNot {
    public static void main(String[] args) {
        checkPowerOf2(15);
        checkPowerOf2(8);
    }

    // Check if a number is the Power of 2 or not
    public static void checkPowerOf2(int num) {
        System.out.println();
        if ((num & (num - 1)) == 0) {
            System.out.println("Power of 2");
        } else {
            System.out.println("Not the Power of 2");
        }
        System.out.println();
    }
}
