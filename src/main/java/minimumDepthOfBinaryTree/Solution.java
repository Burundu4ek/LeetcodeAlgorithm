package minimumDepthOfBinaryTree;

public class Solution {
    int depthGlobal = 1;

    public int minDepth(TreeNode root) {
        if (root == null) return 0;

        if (root.left != null) setMinDepth(root.left, 2);
        if (root.right != null) setMinDepth(root.right, 2);

        return depthGlobal;
    }

    private void setMinDepth(TreeNode node, int depth) {
        if (node == null) return;

        if (node.right == null && node.left == null)
            depthGlobal = depthGlobal > 1 ? Math.min(depthGlobal, depth) : depth;

        setMinDepth(node.left, depth + 1);
        setMinDepth(node.right, depth + 1);
    }
}
