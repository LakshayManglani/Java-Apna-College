package _VQ;

public class _VQ_07_MaxSubArraySum_BruteForce {
    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };

        printSubArrays(numbers);
    }

    public static void printSubArrays(int numbers[]) {
        int maxValue = Integer.MIN_VALUE;

        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                int sum = numbers[i];
                System.out.print("( " + numbers[i]);
                for (int j2 = i + 1; j2 <= j; j2++) {
                    System.out.print(", " + numbers[j2]);
                    sum += numbers[j2];
                }
                System.out.print(" )  ");

                if (sum > maxValue) {
                    maxValue = sum;
                }
            }
            System.out.println();
        }
        System.out.println("Max Sum of SubArrays : " + maxValue);
        System.out.println();
    }
}
