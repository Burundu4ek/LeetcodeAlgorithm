package maximumDepthOfBinaryTree;

public class Solution {
    int res = 0;

    public int maxDepth(TreeNode root) {
        if (root != null)
            getDepth(root, 1);

        return res;
    }

    public void getDepth(TreeNode node, int depth) {
        if (node == null) return;

        if (node.left == null && node.right == null)
            res = Math.max(res, depth);

        getDepth(node.left, depth + 1);
        getDepth(node.right, depth + 1);
    }
}
