package invertTree;

public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return root;

        invertTree(root.right);
        invertTree(root.left);

        TreeNode tempNode = root.left;
        root.left = root.right;
        root.right = tempNode;

        return root;
    }
}
