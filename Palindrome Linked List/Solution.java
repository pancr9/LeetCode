/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {

        ListNode slow, fast;
        slow = fast = head;
        while (slow != null && fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }

        //After above loop, slow points to the center.
        //Reverse the linked list and compare with head untill null.

        ListNode reversed = reverse(slow);

        while (reversed != null) {
            if (reversed.val != head.val)
                return false;

            reversed = reversed.next;
            head = head.next;
        }

        return true;

    }

    /* Function to reverse the linked list */
    private ListNode reverse(ListNode node) {
        ListNode prev = null;
        ListNode current = node;
        ListNode next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }
}
