package diameterOfBinaryTree;

public class Solution {
    int res = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) return res;

        int maxLeft = root.left == null ? 0 : maxDepth(root.left, 1);
        int maxRight = root.right == null ? 0 : maxDepth(root.right, 1);
        res = Math.max(res, maxLeft + maxRight);

        diameterOfBinaryTree(root.left);
        diameterOfBinaryTree(root.right);

        return res;
    }

    private int maxDepth(TreeNode node, int depth) {
        if (node == null) return depth;
        if (node.left == null && node.right == null)
            return depth;

        return Math.max(maxDepth(node.left, depth + 1),
                maxDepth(node.right, depth + 1));
    }
}
