package isSameTree;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    boolean res = true;

    public boolean isSameTree(TreeNode p, TreeNode q) {
        res = compTraversal(p, q);
        return res;
    }

    private boolean compTraversal(TreeNode rF, TreeNode rS) {
        if (!(rF == null && rS == null)) {
            if (rF == null || rS == null) {
                res = false;
                return false;
            }

            if (rF.val != rS.val) {
                res = false;
                return false;
            }

            compTraversal(rF.left, rS.left);
            compTraversal(rF.right, rS.right);
        }

        return res;
    }
}
