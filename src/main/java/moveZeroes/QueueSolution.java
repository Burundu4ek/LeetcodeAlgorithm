package moveZeroes;

import java.util.LinkedList;
import java.util.Queue;

public class QueueSolution {
    public void moveZeroes(int[] nums) {
        Queue<Integer> zeroIndex = new LinkedList<>();

        for (int i = 0; nums.length > i; i++) {
            if (nums[i] == 0) {
                zeroIndex.add(i);
            } else if (!zeroIndex.isEmpty()) {
                nums[zeroIndex.poll()] = nums[i];
                nums[i--] = 0;
            }
        }
    }
}
