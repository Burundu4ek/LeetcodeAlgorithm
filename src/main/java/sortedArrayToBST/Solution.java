package sortedArrayToBST;

import java.util.Arrays;

public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) return null;

        int nodeIndex = nums.length / 2;
        TreeNode node = new TreeNode(nums[nodeIndex]);

        node.left = sortedArrayToBST(Arrays.copyOfRange(nums, 0, nodeIndex));
        node.right = sortedArrayToBST(Arrays.copyOfRange(nums, nodeIndex + 1, nums.length));

        return node;
    }
}
