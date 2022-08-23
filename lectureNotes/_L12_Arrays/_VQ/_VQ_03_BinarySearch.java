package _VQ;

public class _VQ_03_BinarySearch {
    public static void main(String[] args) {
        // Internal Input
        int numbers[] = { 2, 4, 6, 8, 10, 12, 14 };
        int toFind = 8;

        int check = findNumber(numbers, toFind);
        System.out.println();
        if (check == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("Number Found at Postiton : " + check);
        }
        System.out.println();
    }

    // Find Number in the array and return it
    public static int findNumber(int numbers[], int toFind) {
        int start = 0;
        int end = numbers.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (toFind == numbers[mid]) {
                return mid + 1;
            } else if (numbers[mid] < toFind) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;// For Not Found
    }
}
