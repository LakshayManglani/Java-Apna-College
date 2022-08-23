package _VQ;

public class _VQ_04_ReverseAnArray {
    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };

        System.out.print("\nArray : ");
        printArray(numbers);
        revArray(numbers);
        System.out.print("\nReverse Array : ");
        printArray(numbers);
        System.out.println();
    }

    public static void revArray(int numbers[]) {
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - i - 1];
            numbers[numbers.length - i - 1] = temp;
        }
    }

    public static void printArray(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
