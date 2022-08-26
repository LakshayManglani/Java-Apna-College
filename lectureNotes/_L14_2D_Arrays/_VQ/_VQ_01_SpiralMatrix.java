package _VQ;

public class _VQ_01_SpiralMatrix {
    // This code is only for square matrix
    public static void main(String[] args) {
        int matrix[][] = new int[3][5];

        storeNumbers(matrix);
        printArray(matrix);

        printSpiralArray(matrix);
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

    // Print Array
    public static void printArray(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Print Spiral Matrix
    public static void printSpiralArray(int matrix[][]) {
        System.out.println();
        int rowStart = 0;
        int rowEnd = matrix.length - 1;

        int colStart = 0;
        int colEnd = matrix[0].length - 1;

        for (int row = 0; row <= matrix.length / 2; row++) {
            // 1st Upper Row
            for (int j = colStart; j <= colEnd; j++) {
                if (rowStart == rowEnd) {
                    break;
                }
                System.out.print(matrix[row][j] + " ");
            }

            // 2nd Right Column
            rowStart++;
            for (int j = rowStart; j <= rowEnd; j++) {
                System.out.print(matrix[j][colEnd] + " ");
            }
            
            // 3rd Lower Row
            colEnd--;
            for (int i = colEnd; i >= colStart; i--) {
                if (colStart == colEnd) {
                    break;
                }
                System.out.print(matrix[rowEnd][i] + " ");
            }

            // 4th Left Column
            rowEnd--;
            for (int i = rowEnd; i >= rowStart; i--) {

                System.out.print(matrix[i][colStart] + " ");
            }

            colStart++;
        }
        System.out.println();
        System.out.println();
    }
}
