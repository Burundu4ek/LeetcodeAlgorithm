package removeLinkedListElements;

public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return head;

        while (head != null && head.val == val) {
            head = head.next;
        }

        ListNode res = head;
        while (res != null && res.next != null) {
            if (res.next.val == val)
                res.next = res.next.next;
            else
                res = res.next;
        }

        return head;
    }
}
