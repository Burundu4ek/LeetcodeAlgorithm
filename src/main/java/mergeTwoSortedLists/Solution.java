package mergeTwoSortedLists;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        if (l1.val < l2.val) {
            // System.out.println("line 17: " + l1.val + ", " + l2.val);
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            // System.out.println("line 21: " + l1.val + ", " + l2.val);
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }

//    public static void main(String[] args) {
//        ListNode first = new ListNode(1);
//        first.next = new ListNode(2);
//        first.next.next = new ListNode(4);
//
//        ListNode second = new ListNode(1);
//        second.next = new ListNode(3);
//        second.next.next = new ListNode(4);
//
//        ListNode newList = mergeTwoLists(first, second);
////        System.out.println(newList);
//    }
}
