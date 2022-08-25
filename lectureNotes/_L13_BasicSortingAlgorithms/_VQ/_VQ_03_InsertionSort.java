package _VQ;

public class _VQ_03_InsertionSort {
    public static void main(String[] args) {
        int unsortedArray[] = { 5, 4, 1, 2, 3 };

        System.out.println();
        sortArray(unsortedArray);
    }

    public static void sortArray(int unsortedArray[]) {
        // For finding the correct place of the number
        int temp = unsortedArray[0];
        int rightPlace = 0;
        for (int i = 1; i < unsortedArray.length; i++) {
            temp = unsortedArray[i];
            rightPlace = i;
            for (int j = i - 1; j >= 0; j--) {
                if (temp < unsortedArray[j]) {
                    // change the postion of sorted array
                    unsortedArray[j + 1] = unsortedArray[j];

                    // Stores the Correct position for the temp Variable
                    rightPlace = j;
                }
            }

            // Place the temp to it's correct postion
            unsortedArray[rightPlace] = temp;

        }

        // Output :-
        System.out.print("( " + unsortedArray[0]);
        for (int k = 1; k < unsortedArray.length; k++) {
            System.out.print(", " + unsortedArray[k]);
        }
        System.out.println(" )\n");
    }
}
