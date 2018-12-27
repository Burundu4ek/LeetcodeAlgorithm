package reverseList;

public class RecursivelySolution {
    ListNode reversedList;
    ListNode curElement;

    public ListNode reverseList(ListNode head) {
        if (head == null) return reversedList;
        if (head.next != null) reverseList(head.next);

        if (reversedList == null) {
            reversedList = new ListNode(head.val);
            curElement = reversedList;
        } else {
            curElement.next = new ListNode(head.val);
            curElement = curElement.next;
        }

        return reversedList;
    }

}