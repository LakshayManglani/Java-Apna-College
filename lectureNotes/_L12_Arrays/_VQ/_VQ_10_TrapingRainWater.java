package _VQ;

public class _VQ_10_TrapingRainWater {
    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };


        calculateTrapedRaniWater(height);
    }

    public static void calculateTrapedRaniWater(int height[]) {
        int maxHeight = height[0];
        int startBuilding = 0;
        int endBuilding = 0;
        int trapedWater = 0;
        for (int i = 1; i < height.length; i++) {
            if (height[i] > maxHeight) {
                endBuilding = i;
                for (int j = startBuilding; j < endBuilding; j++) {
                    trapedWater += (maxHeight - height[j]);
                }
                startBuilding = i;
                maxHeight = height[i];
            }
            if (i == (height.length - 1) && maxHeight >= height[i]) {
                for (int j = startBuilding + 1; j < height.length; j++) {
                    if (height[i] - height[j] >= 0) {
                        trapedWater += (height[i] - height[j]);
                    }
                }
            }
        }
        System.out.println("\n" + trapedWater + "\n");
    }
}
