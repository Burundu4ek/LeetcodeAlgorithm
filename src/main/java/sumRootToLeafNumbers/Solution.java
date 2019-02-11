package sumRootToLeafNumbers;

public class Solution {
    int res = 0;

    public int sumNumbers(TreeNode root) {
        if (root != null) sumNumbers(root, 0);

        return res;
    }

    private void sumNumbers(TreeNode node, int sum) {
        if (node == null) return;
        if (node.left == null && node.right == null) {
            res += sum * 10 + node.val;
        } else {
            sumNumbers(node.left, sum * 10 + node.val);
            sumNumbers(node.right, sum * 10 + node.val);
        }
    }
}
