package hasCycle;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    Set<ListNode> nodes = new HashSet<>();

    public boolean hasCycle(ListNode head) {
        if (head != null) {

            while (!nodes.contains(head) && head.next != null) {
                nodes.add(head);
                head = head.next;
            }
        }

        return head != null ? nodes.contains(head) : false;
    }
}
