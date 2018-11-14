package pivotIndex;

public class Solution {
    public int pivotIndex(int[] nums) {
        if (nums == null || nums.length == 0)
            return -1;

        long sum = 0, leftSum = nums[0];

        for (int n : nums) {
            sum += n;
        }

        if (sum - leftSum == 0)
            return 0;

        for (int i = 1; i < nums.length; i++) {
            if (leftSum == sum - leftSum - nums[i])
                return i;
            leftSum += nums[i];
        }

        return -1;
    }
}
