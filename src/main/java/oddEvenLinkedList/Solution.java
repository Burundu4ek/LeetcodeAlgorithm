package oddEvenLinkedList;

public class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) return head;

        ListNode oddNodes = head.next;
        ListNode oddNodeItter = oddNodes;
        ListNode evenNodeItter = head;

        while (oddNodeItter != null && oddNodeItter.next != null) {
            evenNodeItter.next = oddNodeItter.next;
            oddNodeItter.next = oddNodeItter.next.next;
            oddNodeItter = oddNodeItter.next;
            evenNodeItter = evenNodeItter.next;
        }

        evenNodeItter.next = oddNodes;
        return head;
    }
}
