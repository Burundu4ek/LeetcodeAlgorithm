package searchInsert;

public class Solution {
    public int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0)
            return 0;

        int low = 0, high = nums.length - 1, mid, res = -1;

        while (low < high) {
            mid = (high + low) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target)
                low = mid + 1;
            else
                high = mid;
        }

        if (low == high) {
            if (nums[low] < target)
                return low + 1;
            else
                return low;
        }

        return res;
    }
}
