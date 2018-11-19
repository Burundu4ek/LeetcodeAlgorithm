package inorderTraversal;

import java.util.ArrayList;
import java.util.List;

public class RecursiveSolution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null)
            return res;

        traversal(root, res);
        return res;
    }

    private void traversal(TreeNode r, List<Integer> list) {
        if (r.left != null)
            traversal(r.left, list);
        list.add(r.val);
        if (r.right != null)
            traversal(r.right, list);
    }
}
