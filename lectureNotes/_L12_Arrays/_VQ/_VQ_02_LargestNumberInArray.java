package _VQ;

public class _VQ_02_LargestNumberInArray {
    public static void main(String[] args) {
        // Internal Input
        int numbers[] = { 23, 43, 55, 22, 11, 23 };

        System.out.println("\nLargest Value in Array is : " + findMax(numbers) + "\n");
    }

    public static int findMax(int numbers[]) {
        // Store the minium value of Integer
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (maxValue < numbers[i]) {
                maxValue = numbers[i];
            }
        }
        return maxValue;
    }
}
