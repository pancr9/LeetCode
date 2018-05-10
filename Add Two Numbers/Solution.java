/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode result = new ListNode(0);
        ListNode returnResult = result;

        int val = 0;
        int carry = 0;

        while (result != null) {
            
            val = 0;
            
            if(l1!=null)
                val += l1.val;
            if(l2!=null)
                val += l2.val;
            
            val += result.val;

            if(l1!=null)
            l1 = l1.next;
            
            if(l2!=null)
            l2 = l2.next;

            if (val > 9) {
                carry = 1;
                val -= 10;
            } else carry = 0;

            result.val = val;
            
            if(l1 == null && l2 == null && carry!= 0)
                result.next = new ListNode(carry);
            if(l1!=null || l2!=null)
                result.next = new ListNode(carry);
            
            result = result.next;
        }

        return returnResult;
    }
}
