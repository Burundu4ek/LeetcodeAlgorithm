package majorityElement;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> elements = new HashMap<>();

        for (int n : nums) {
            if (elements.containsKey(n)) {
                elements.replace(n, elements.get(n) + 1);
            } else
                elements.put(n, 1);

            if (elements.get(n) > nums.length / 2)
                return n;
        }

        return -1;
    }
}
