package _VQ;

public class _VQ_01_LinearSearch {
    public static void main(String[] args) {
        // Internal Input
        int numbers[] = { 24, 23, 3, 54, 34, 2 };
        int key = 54;

        // Output
        int check = searchKey(numbers, key);
        System.out.println();
        if (check == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("Key found at " + check);
        }
        System.out.println();
    }

    // Search the key in array and return
    public static int searchKey(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i + 1;
            }
        }
        return -1;// For Not found
    }
}