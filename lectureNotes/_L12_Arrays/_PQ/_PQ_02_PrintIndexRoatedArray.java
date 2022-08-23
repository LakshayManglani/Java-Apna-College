package _PQ;

public class _PQ_02_PrintIndexRoatedArray {
    public static void main(String[] args) {
        int nums[] = { 0, 1, 2, 4, 5, 6, 7 };
        int pivot = 5;

        System.out.println();
        checkArray(nums, pivot);
        System.out.println();
    }

    public static void checkArray(int nums[], int pivot) {
        for (int i = 0; i < nums.length; i++) {
            if (pivot == nums[i]) {
                printArray(nums, i);
                return;
            }
        }
        System.out.println("-1");
        return;
    }

    public static void printArray(int nums[], int i) {
        System.out.print("{ " + nums[i]);
        for (int j = i + 1; j < nums.length; j++) {
            System.out.print(", " + nums[j]);
        }
        for (int j = 0; j < i; j++) {
            System.out.print(", " + nums[j]);
        }
        System.out.println(" }");
    }
}
