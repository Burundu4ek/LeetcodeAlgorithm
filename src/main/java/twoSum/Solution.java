package twoSum;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numsMap = new HashMap<>();

        int i = 0;
        for (int num : nums) {
            int dif = target - num;
            if (numsMap.containsKey(dif)) {
                return new int[]{numsMap.get(dif), i};
            } else {
                numsMap.put(num, i++);
            }
        }
        return new int[2];
    }
}
