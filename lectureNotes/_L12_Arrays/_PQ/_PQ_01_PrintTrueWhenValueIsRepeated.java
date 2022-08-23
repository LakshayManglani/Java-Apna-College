package _PQ;

// Questions : If in array any value repeats twice then print true otherwise print false

public class _PQ_01_PrintTrueWhenValueIsRepeated {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 1 };

        System.out.println();
        calculateTwice(nums);
        System.out.println();
    }

    public static void calculateTwice(int nums[]) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    System.out.println("True");
                    return;
                }
            }
        }

        System.out.println("False");
        return;
    }
}
