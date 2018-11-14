package dominantIndex;

public class Solution {
    public int dominantIndex(int[] nums) {
        // if (nums == null)
        //     return -1;
        if (nums.length == 1)
            return 0;

        int firstMax = nums[0], secondMax = 0, fMaxIndex = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > firstMax) {
                secondMax = firstMax;
                firstMax = nums[i];
                fMaxIndex = i;
            } else if (nums[i] > secondMax) {
                secondMax = nums[i];
            }
        }

        if (secondMax * 2 <= firstMax)
            return fMaxIndex;
        else
            return -1;
    }
}
