package _VQ;

public class _VQ_05_CountingSort {
    public static void main(String[] args) {
        int unsortedArray[] = { 1, 4, 1, 3, 2, 4, 3, 7 };
        int max = 7;

        countingSort(unsortedArray, max);

        System.out.println();
        printArray(unsortedArray);
    }

    public static void countingSort(int unsortedArray[], int max) {
        int countingArray[] = new int[max + 1];

        for (int i = 0; i < unsortedArray.length; i++) {
            countingArray[unsortedArray[i]]++;
        }

        // Output
        int j = 0;
        for (int i = 0; i < countingArray.length; i++) {
            while (countingArray[i] > 0) {
                unsortedArray[j] = i;
                j++;
                countingArray[i]--;
            }
        }
    }

    // Print Array
    public static void printArray(int array[]) {
        System.out.print("( " + array[0]);
        for (int k = 1; k < array.length; k++) {
            System.out.print(", " + array[k]);
        }
        System.out.println(" )\n");
    }
}
