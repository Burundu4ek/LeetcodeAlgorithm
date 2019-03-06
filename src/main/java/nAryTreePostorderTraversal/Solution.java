package nAryTreePostorderTraversal;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    List<Integer> res = new ArrayList<>();

    public List<Integer> postorder(Node root) {
        if (root == null) return res;

        if (root.children != null) {
            for (Node child : root.children) {
                postorder(child);
            }
        }

        res.add(root.val);

        return res;
    }
}
