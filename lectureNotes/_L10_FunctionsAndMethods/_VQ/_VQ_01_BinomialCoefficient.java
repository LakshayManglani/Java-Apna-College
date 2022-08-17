package _VQ;

public class _VQ_01_BinomialCoefficient {
    public static void main(String[] args) {
        int n = 5;
        int r = 2;

        int ans = factorial(n) / (factorial(r) * factorial(n - r));

        System.out.println(ans);
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
