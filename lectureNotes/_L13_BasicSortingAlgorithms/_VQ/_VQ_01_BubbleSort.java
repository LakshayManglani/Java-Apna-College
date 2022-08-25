package _VQ;

public class _VQ_01_BubbleSort {
    public static void main(String[] args) {
        int unsortedArray[] = { 5, 4, 1, 2, 3 };

        System.out.println();
        sortArray(unsortedArray);
        System.out.println("\n");
    }

    public static void sortArray(int unsortedArray[]) {
        for (int i = 0; i < unsortedArray.length; i++) {
            for (int j = 0; j < unsortedArray.length - 1; j++) {
                if (unsortedArray[j] > unsortedArray[j + 1]) {
                    int temp = unsortedArray[j];
                    unsortedArray[j] = unsortedArray[j + 1];
                    unsortedArray[j + 1] = temp;
                }
            }
        }

        System.out.print("( " + unsortedArray[0]);
        for (int j = 1; j < unsortedArray.length; j++) {
            System.out.print(", " + unsortedArray[j]);
        }
        System.out.println(" )");
    }
}
