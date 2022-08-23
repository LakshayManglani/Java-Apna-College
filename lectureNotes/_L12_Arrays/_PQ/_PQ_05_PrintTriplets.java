package _PQ;

// This Question is Pending.

public class _PQ_05_PrintTriplets {
    public static void main(String[] args) {
        int nums[] = { -1, 0, 1, 2, -1, -4 };
        int correctArray[] = new int[nums.length];

        makeCorrectArray(nums, correctArray);
    }

    public static void makeCorrectArray(int nums[], int correctArray[]) {
        correctArray[0] = nums[0];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < correctArray.length; j++) {
                if (nums[i + 1] == correctArray[j]) {
                    break;
                }
            }
        }
    }
}
