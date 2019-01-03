package minSubArrayLen;

public class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int res = nums.length + 1;
        int sum = 0;

        for (int i = 0, j = 0; i < nums.length; i++) {
            sum += nums[i];

            while (sum >= s && i >= j) {
                res = Math.min(i + 1 - j, res);
                sum -= nums[j++];
            }

            if (res == 1)
                break;
        }

        return res < nums.length + 1 ? res : 0;
    }
}
