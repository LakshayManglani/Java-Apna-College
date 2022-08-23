//Important Question

package _VQ;

public class _VQ_08_MaxSubArraySum_PrefixSum {

    public static void main(String[] args) {
        int numbers[] = { 1, -2, 6, -1, 3 };

        printSubArrays(numbers);
    }

    public static void printSubArrays(int numbers[]) {
        int maxValue = Integer.MIN_VALUE;
        int prefixSum[] = new int[numbers.length];
        int currentNumber;

        // For Creating First Prefix Sum from 0-1,0-2,0-3.0-4....
        prefixSum[0] = numbers[0];
        for (int i = 1; i < prefixSum.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + numbers[i];
        }

        // For Checking Other Sums
        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                // To calcuate current numbers sum
                currentNumber = i == 0 ? prefixSum[i] : prefixSum[j] - prefixSum[i - 1];

                // To find Max Value
                if (currentNumber > maxValue) {
                    maxValue = currentNumber;
                }
            }
        }
        System.out.println("Max Value : " + maxValue);
        System.out.println();
    }
}
