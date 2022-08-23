package _VQ;

public class _VQ_07_MaxSubArraySum_BruteForce {
    public static void main(String[] args) {
        int numbers[] = { 1, -2, 6, -1, 3 };

        printSubArrays(numbers);
    }

    public static void printSubArrays(int numbers[]) {
        int maxValue = Integer.MIN_VALUE;

        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                System.out.print("( ");
                for (int j2 = i; j2 < j; j2++) {
                    System.out.print(numbers[j2] + ", ");
                }
                System.out.print(numbers[j] + " )  ");
            }
            System.out.println();
            for (int j = i; j < numbers.length; j++) {
                int sum = 0;
                for (int j2 = i; j2 <= j; j2++) {
                    sum += numbers[j2];
                }
                if (sum > maxValue) {
                    maxValue = sum;
                }
            }
        }
        System.out.println("Max Sum of SubArrays : " + maxValue);
        System.out.println();
    }
}
