package _VQ;

public class _VQ_02_DiagonalSum {
    public static void main(String[] args) {
        int n = 4;
        int matrix[][] = new int[n][n];

        storeNumbers(matrix);
        System.out.println();
        printArray(matrix);

        System.out.println();
        diagonalSum(matrix);
        System.out.println();
    }

    // Initializing array with numbers
    public static void storeNumbers(int matrix[][]) {
        int count = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = count++;
            }
        }
    }

    // Diagonal Sum
    public static void diagonalSum(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            // For odd Array
            if (matrix.length % 2 != 0 && i == (int) (matrix.length / 2)) {
                sum += matrix[i][i];
                continue;
            }

            // Calculate First Diagonal sum from 0,0 to n,n
            sum += matrix[i][i];
            // Calculate Second Diagonal sum from 0,n to n,0
            sum += matrix[i][matrix.length - i - 1];
        }

        // Output
        System.out.println("Total Diagonal Sum : " + sum);
    }

    // Print Array
    public static void printArray(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
