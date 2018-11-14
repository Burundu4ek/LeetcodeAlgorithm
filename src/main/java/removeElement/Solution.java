package removeElement;

public class Solution {
    public int removeElement(int[] nums, int val) {
        int t = 0, count = 0;

        for (int i = nums.length - 1; i >= t; ) {
            if (nums[i] != val) {
                if (nums[t] == val) {
                    nums[t++] = nums[i--];
                    count++;
                }
            } else {
                i--;
                count++;
            }
            if (nums[t] != val) {
                t++;
            }
        }

        return nums.length - count;
    }
}
