package singleNumber;

import java.util.Arrays;

public class SortSolution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);

        for (int i = nums.length - 2; i >= 0; i = i - 2) {
            if (nums[i] != nums[i + 1])
                return nums[i + 1];
        }

        return nums[0];
    }
}
