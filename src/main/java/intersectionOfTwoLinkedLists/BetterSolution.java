package intersectionOfTwoLinkedLists;

public class BetterSolution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;

        ListNode pointerA = headA, pointerB = headB;
        ListNode lastA = null, lastB = null;

        while (pointerA != pointerB) {
            if (lastA != null && lastB != null && lastA != lastB)
                return null;

            if (pointerA.next == null) lastA = pointerA;
            if (pointerB.next == null) lastB = pointerB;

            pointerA = pointerA.next == null ? headB : pointerA.next;
            pointerB = pointerB.next == null ? headA : pointerB.next;
        }

        return pointerA;
    }
}
