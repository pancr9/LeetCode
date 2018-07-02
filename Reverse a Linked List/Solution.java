/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 
class Solution {

    public ListNode reverseList(ListNode head) {

        if (head == null || head.next == null) return head;

        ListNode a = null;

        while (head != null) {
            int val = head.val;
            head = head.next;

            ListNode b = new ListNode(val);

            if (a != null)
                b.next = a;

            a = b;
        }
        return a;
    }
}
