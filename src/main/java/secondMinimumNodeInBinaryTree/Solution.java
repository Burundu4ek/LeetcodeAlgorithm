package secondMinimumNodeInBinaryTree;

public class Solution {
    public int findSecondMinimumValue(TreeNode root) {
        return traverse(root, root.val, -1);
    }

    public int traverse(TreeNode node, int fstMin, int sndMin) {
        if (node != null) {
            if (node.val != fstMin) {
                if (node.val < fstMin) {
                    sndMin = fstMin;
                    fstMin = node.val;
                } else if (sndMin == -1 || node.val < sndMin) {
                    sndMin = node.val;
                }
            }

            sndMin = traverse(node.right, fstMin, traverse(node.left, fstMin, sndMin));
        }

        return sndMin;
    }
}
