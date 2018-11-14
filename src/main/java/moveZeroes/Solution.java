package moveZeroes;

public class Solution {
    public void moveZeroes(int[] nums) {
        for (int i = 0, j = 0; nums.length > i; i++) {
            if (nums[i] != 0) {
                if (i != j) {
                    nums[j++] = nums[i];
                    nums[i] = 0;
                } else
                    j++;
            }
        }
    }
}
