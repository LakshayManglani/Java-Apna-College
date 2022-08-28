package _VQ;

public class _VQ_08_FastExponentiation {
    public static void main(String[] args) {
        calculatePower(5, 3);
    }

    public static void calculatePower(int num, int power) {
        int ans = 1;
        while (power > 0) {
            // Check LSB :- Least Significant Bit
            if ((power & 1) != 0) {
                ans *= num;
            }
            num *= num;
            power = power >> 1;
        }

        System.out.println();
        System.out.println(ans);
        System.out.println();
    }
}
