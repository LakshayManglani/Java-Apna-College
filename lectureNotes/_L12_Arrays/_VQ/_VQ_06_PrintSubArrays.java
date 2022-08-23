package _VQ;

public class _VQ_06_PrintSubArrays {
    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };

        printSubArrays(numbers);
    }

    public static void printSubArrays(int numbers[]) {
        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                System.out.print("( ");
                for (int j2 = i; j2 < j; j2++) {
                    System.out.print(numbers[j2] + ", ");
                }
                System.out.print(numbers[j] + " )  ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
