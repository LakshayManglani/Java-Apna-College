package _VQ;

public class _VQ_09_MaxSubArraySum_KadanesAlgoritm {
    public static void main(String[] args) {
        int numbers[] = { -2, -3, 4, -1, -2, 1, 5, -3 };

        // For negative array like :-
        // int numbers[] = { -2, -3, -1, -2, -3 };

        findSubArrayMaxSum(numbers);
    }

    // Find SubArray Max Sum According to Kadanes Algorithm
    public static void findSubArrayMaxSum(int numbers[]) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int maxValue = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            // Find Sum
            currentSum = numbers[i] + currentSum;

            // if findSum have negative value then make it 0
            currentSum = currentSum < 0 ? 0 : currentSum;

            // For finding max Value
            maxSum = Math.max(currentSum, maxSum);

            // For finding max value in a array of negative numbers.
            maxValue = Math.max(maxValue, numbers[i]);
        }
        if (maxValue >= 0) {
            System.out.println("\nMax Sum is : " + maxSum + "\n");
        } else {
            System.out.println("\nMax Sum is : " + maxValue + "\n");
        }
    }
}
