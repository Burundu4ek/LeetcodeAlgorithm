package missingNumber;

public class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum = sum - nums[i] + i;
        }

        return sum + nums.length;
    }
}
