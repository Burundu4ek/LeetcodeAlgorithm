package intersectionOfTwoLinkedLists;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        Set<ListNode> setListA = new HashSet<>();

        while (headA != null) {
            setListA.add(headA);
            headA = headA.next;
        }

        while (headB != null) {
            if (setListA.contains(headB))
                return headB;
            headB = headB.next;
        }

        return headB;
    }
}
