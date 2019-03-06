package univaluedBinaryTree;

public class Solution {
    public boolean isUnivalTree(TreeNode root) {
        if (root == null) return true;

        return isUnivalTree(root, root.val);
    }

    private boolean isUnivalTree(TreeNode node, int val) {
        if (node == null) return true;
        if (node.val != val) return false;

        return isUnivalTree(node.left, val) && isUnivalTree(node.right, val);
    }
}
