package containerWithMostWater;

public class Solution {
    public int maxArea(int[] height) {
        int maxGlobal = 0;

        for (int h = 0, t = height.length - 1; h < t; ) {
            int localMax = Math.min(height[h], height[t]) * (t - h);
            maxGlobal = Math.max(maxGlobal, localMax);

            if (height[h] < height[t])
                h++;
            else
                t--;
        }

        return maxGlobal;
    }
}
