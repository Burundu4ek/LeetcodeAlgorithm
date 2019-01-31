package binaryTreePaths;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    List<String> res = new ArrayList();

    public List<String> binaryTreePaths(TreeNode root) {
        if (root != null)
            findStringPath(root, new StringBuilder());

        return res;
    }

    private void findStringPath(TreeNode node, StringBuilder path) {
        if (node == null) return;

        if (path.length() > 0)
            path.append("->");
        path.append(node.val);

        if (node.left == null && node.right == null) {
            res.add(path.toString());
        } else {
            findStringPath(node.left, path);
            findStringPath(node.right, path);
        }

        if (path.length() > 3)
            path.delete(path.lastIndexOf(">") - 1, path.length());
    }
}
