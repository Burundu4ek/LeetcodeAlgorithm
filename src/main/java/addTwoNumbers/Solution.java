package addTwoNumbers;

public class Solution {
    int rem = 0;

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return rem > 0 ? new ListNode(rem) : null;
        } else {
            int cur = 0;

            if (l1 != null && l2 != null) cur = l1.val + l2.val + rem;
            else {
                if (l1 == null) {
                    l1 = l2;
                    l2 = null;
                }
                cur = l1.val + rem;
            }

            l1.val = cur > 9 ? cur % 10 : cur;
            rem = cur > 9 ? 1 : 0;

            l1.next = l2 == null ? addTwoNumbers(l1.next, null)
                    : addTwoNumbers(l1.next, l2.next);
        }

        return l1;
    }
}
