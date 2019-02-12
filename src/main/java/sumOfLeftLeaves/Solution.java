package sumOfLeftLeaves;

public class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        return sumOfLeftLeaves(root, 0);
    }

    private int sumOfLeftLeaves(TreeNode node, int sum) {
        if (node == null) return 0;

        sum = sumOfLeftLeaves(node.right, sum);
        sum += sumOfLeftLeaves(node.left, sum);

        if (node.left != null && node.left.right == null && node.left.left == null)
            return sum + node.left.val;

        return sum;
    }
}
