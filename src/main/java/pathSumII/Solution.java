package pathSumII;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        addList(root, sum, new ArrayList<>());

        return res;
    }

    private void addList(TreeNode node, int rem, ArrayList list) {
        if (node == null) return;

        ArrayList<Integer> newlist = new ArrayList(list);
        newlist.add(node.val);
        int diff = rem - node.val;

        if (node.left == null && node.right == null && diff == 0) {
            res.add(newlist);
        } else {
            addList(node.left, diff, newlist);
            addList(node.right, diff, newlist);
        }
    }
}
