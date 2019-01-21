package removeNthFromEnd;

import java.util.HashMap;
import java.util.Map;

public class HashMapSolution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return null;
        Map<Integer, ListNode> nodes = new HashMap<>();
        nodes.put(1, head);

        int length = 1;
        ListNode node = head;

        while (node.next != null) {
            length++;
            node = node.next;
            nodes.put(length, node);
        }

        if (length == 1) return null;
        if (length == n) return head.next;

        ListNode nodeChange = nodes.get(length - n);
        nodeChange.next = nodeChange.next == null ? null : nodeChange.next.next;

        return head;
    }
}
