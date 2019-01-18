package hasCycleII;

public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode hare = head;
        ListNode tortoise = head;

        while (hare != null && hare.next != null) {
            hare = hare.next.next;
            tortoise = tortoise.next;
            if (hare == tortoise) {
                break;
            }
        }

        if (hare == null || hare.next == null)
            return null;

        while (head != tortoise) {
            head = head.next;
            tortoise = tortoise.next;
        }

        return head;
    }
}
