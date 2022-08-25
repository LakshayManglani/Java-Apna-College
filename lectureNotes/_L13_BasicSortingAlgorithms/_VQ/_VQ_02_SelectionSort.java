package _VQ;

public class _VQ_02_SelectionSort {
    public static void main(String[] args) {
        int unsortedArray[] = { 5, 4, 1, 2, 3 };

        System.out.println();
        sortArray(unsortedArray);
    }

    public static void sortArray(int unsortedArray[]) {
        for (int i = 0; i < unsortedArray.length; i++) {
            int minAt = i;
            for (int j = i; j < unsortedArray.length; j++) {
                if (unsortedArray[j] < unsortedArray[minAt]) {
                    minAt = j;
                }
            }

            // Swaping
            int temp = unsortedArray[minAt];
            unsortedArray[minAt] = unsortedArray[i];
            unsortedArray[i] = temp;
        }

        System.out.print("( " + unsortedArray[0]);
        for (int i = 1; i < unsortedArray.length; i++) {
            System.out.print(", " + unsortedArray[i]);
        }
        System.out.println(" )\n");
    }
}
