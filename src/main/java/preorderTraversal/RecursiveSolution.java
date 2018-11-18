package preorderTraversal;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */

public class RecursiveSolution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null)
            return res;

        travers(root, res);
        return res;
    }

    private void travers(TreeNode root, List<Integer> res) {
        res.add(root.val);
        if (root.left == null)
            travers(root.left, res);
        if (root.right == null)
            travers(root.right, res);
    }
}

