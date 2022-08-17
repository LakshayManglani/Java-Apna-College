package _VQ;

public class _VQ_05_Overloading {
    public static void main(String[] args) {
        // Overloading allow to make us different function with same number but with
        // different parameter

        System.out.println(sum(4, 5));
        System.out.println(sum(4, 5, 4));
    }

    public static int sum(int a, int b) {
        return (a + b);
    }

    public static int sum(int a, int b, int c) {
        return (a + b + c);
    }
}
