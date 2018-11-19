package postorderTraversal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RecursiveSolution {
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }

        traverse(root, res);
        Collections.reverse(res);
        return res;
    }

    private void traverse(TreeNode r, List<Integer> list) {
        list.add(r.val);

        if (r.right != null) {
            traverse(r.right, list);
        }
        if (r.left != null) {
            traverse(r.left, list);
        }
    }
}
