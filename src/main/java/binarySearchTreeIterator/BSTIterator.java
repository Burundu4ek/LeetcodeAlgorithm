package binarySearchTreeIterator;

import java.util.Stack;

public class BSTIterator {
    private Stack<TreeNode> stackTree = new Stack<TreeNode>();

    public BSTIterator(TreeNode root) {
        while (root != null) {
            stackTree.push(root);
            root = root.left;
        }
    }

    /**
     * @return the next smallest number
     */
    public int next() {
        TreeNode node = stackTree.pop();
        TreeNode cur = node.right;

        while (cur != null) {
            stackTree.push(cur);
            cur = cur.left;
        }

        return node.val;
    }

    /**
     * @return whether we have a next smallest number
     */
    public boolean hasNext() {
        return !stackTree.isEmpty();
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
