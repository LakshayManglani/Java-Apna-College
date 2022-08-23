package _VQ;

public class _VQ_05_PrintPairs {
    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };

        printPairs(numbers);

        // Formula for total pairs is (n*(n-1))/2
    }

    public static void printPairs(int numbers[]) {
        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + numbers[i] + "," + numbers[j] + ") ");
            }
            System.out.println();
        }
    }
}
