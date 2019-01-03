package singleNumber;

import java.util.HashSet;
import java.util.Set;

public class SetSolution {
    public int singleNumber(int[] nums) {
        Set<Integer> setNums = new HashSet<>();
        int res = nums[0];

        for (int num : nums) {
            if (setNums.contains(num))
                setNums.remove(num);
            else
                setNums.add(num);
        }

        for (int num : setNums) {
            return num;
        }

        return res;
    }
}
