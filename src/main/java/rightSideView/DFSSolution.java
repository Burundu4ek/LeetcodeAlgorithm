package rightSideView;

/*
 *
 *      Depth-First Search
 */

import java.util.ArrayList;
import java.util.List;

public class DFSSolution {
    List<Integer> res = new ArrayList<>();

    public List<Integer> rightSideView(TreeNode root) {
        traverse(root, 0);

        return res;
    }

    private void traverse(TreeNode node, int level) {
        if (node == null) return;

        if (level == res.size())
            res.add(node.val);

        traverse(node.right, level + 1);
        traverse(node.left, level + 1);
    }
}
