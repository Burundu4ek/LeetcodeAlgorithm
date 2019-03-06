package searchBST;

public class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) return root;
        TreeNode res = null;

        if (root.val == val) return root;
        if (res == null) res = searchBST(root.left, val);
        if (res == null) res = searchBST(root.right, val);

        return res;
    }
}
