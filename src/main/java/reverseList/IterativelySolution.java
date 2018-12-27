package reverseList;

import java.util.Stack;

public class IterativelySolution {
    Stack<Integer> stackNodes = new Stack<>();

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;

        while (head != null) {
            stackNodes.push(head.val);
            head = head.next;
        }

        ListNode reversedList = new ListNode(stackNodes.pop());
        ListNode curElement = reversedList;

        while (!stackNodes.isEmpty()) {
            curElement.next = new ListNode(stackNodes.pop());
            curElement = curElement.next;
        }

        return reversedList;
    }
}
