package hasPathSum;

public class Solution {
    boolean res = false;

    public boolean hasPathSum(TreeNode root, int sum) {
        if (root != null) {
            if (!res) {
                int rem = sum - root.val;

                if (root.left == null && root.right == null && rem == 0) {
                    res = true;
                }

                hasPathSum(root.left, rem);
                hasPathSum(root.right, rem);
            }
        }

        return res;
    }
}
