package findMaxConsecutiveOnes;

public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int globalCount = 0;
        int localCount = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1)
                localCount++;
            else {
                globalCount = Math.max(globalCount, localCount);
                localCount = 0;
            }
        }

        return Math.max(globalCount, localCount);
    }
}
