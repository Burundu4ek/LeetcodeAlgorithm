package containsDuplicate;

import java.util.HashSet;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
//         if (nums == null || nums.length == 0)
//             return false;

        HashSet<Integer> numsSet = new HashSet<>(nums.length);

        for (int num : nums) {
            if (numsSet.contains(num)) {
                return true;
            }
            numsSet.add(num);
        }

        return false;
    }
}
