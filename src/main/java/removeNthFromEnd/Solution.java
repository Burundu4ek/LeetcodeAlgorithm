package removeNthFromEnd;

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return null;

        int length = getLength(head);

        if (length == 1) return null;
        if (length == n) return head.next;
        ListNode node = head;

        while (length - 1 != n) {
            node = node.next;
            length--;
        }

        node.next = node.next == null ? null : node.next.next;

        return head;
    }

    private int getLength(ListNode list) {
        int length = 1;
        ListNode node = list;

        while (node.next != null) {
            length++;
            node = node.next;
        }

        return length;
    }
}
