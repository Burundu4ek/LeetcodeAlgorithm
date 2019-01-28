package balancedBinaryTree;

public class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root != null) {
            if (Math.abs(getDepth(root.left, 0) - getDepth(root.right, 0)) > 1)
                return false;

            return isBalanced(root.right) && isBalanced(root.left);
        }
        return true;
    }

    private int getDepth(TreeNode node, int depth) {
        if (node == null) return depth;

        return Math.max(getDepth(node.left, depth + 1), getDepth(node.right, depth + 1));
    }

//    public static void main(String[] args) {
//        TreeNode test = new TreeNode(1);
//        test.left = new TreeNode(2);
//        test.right = new TreeNode(2);
//        test.left.left = new TreeNode(3);
//        test.left.right = new TreeNode(3);
//        test.left.left.left = new TreeNode(4);
//        test.left.left.right = new TreeNode(4);
//
//        System.out.println(isBalanced(test));
//    }
}
