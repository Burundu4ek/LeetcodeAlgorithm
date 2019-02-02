package rightSideView;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
 *
 *      Breadth-First Search
 */

public class LevelTraverseSolutionSlower {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> answer = new ArrayList<>();
        Queue<TreeNode> nodes = new LinkedList<>();

        if (root != null) {
            nodes.offer(root);
            answer.add(root.val);

            int level = 1;
            TreeNode curNode;

            while (!nodes.isEmpty()) {
                level++;
                int size = nodes.size();

                for (int i = 0; i < size; i++) {
                    curNode = nodes.poll();

                    if (curNode.right != null) {
                        if (level > answer.size())
                            answer.add(curNode.right.val);
                        nodes.add(curNode.right);
                    }

                    if (curNode.left != null) {
                        if (level > answer.size())
                            answer.add(curNode.left.val);
                        nodes.add(curNode.left);
                    }
                }
            }
        }

        return answer;
    }
}
