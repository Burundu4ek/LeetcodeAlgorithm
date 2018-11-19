package preorderTraversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class IterativelySolution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null)
            return res;

        Stack<TreeNode> stNode = new Stack<>();
        stNode.push(root);

        while (!stNode.isEmpty()) {
            TreeNode node = stNode.pop();
            res.add(node.val);

            if (node.right != null)
                stNode.push(node.right);
            if (node.left != null)
                stNode.push(node.left);
        }

        return res;
    }
}
