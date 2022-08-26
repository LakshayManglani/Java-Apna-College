package _VQ;

public class _VQ_03_StairCaseSearchKey {
    public static void main(String[] args) {
        int matrix[][] = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 48 }, { 32, 33, 39, 50 } };
        int key = 30;

        System.out.println();
        searchKey(matrix, key);
        System.out.println();
    }

    public static void searchKey(int matrix[][], int key) {
        int i = matrix[0].length - 1;
        int j = 0;
        while (matrix[i][j] != key) {
            if (key < matrix[i][j]) {
                i--;
            } else {
                j++;
            }

            if (i > matrix.length - 1 || i < 0 || j > matrix[0].length - 1 || j < 0) {
                System.out.println("Number Not Found");
                return;
            }
        }
        System.out.println("Number Found at Index matrix(" + i + ", " + j + ")");
    }
}
