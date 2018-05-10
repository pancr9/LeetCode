/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
   public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if(l1 == null && l2 == null) return l1;
        ListNode merged = new ListNode(0);
        ListNode mergedPointerNode = merged;

        int l1Val, l2Val;
        while (merged != null) {
            
            l1Val = l2Val = Integer.MAX_VALUE;
            if (l1 != null) {
                l1Val = l1.val;
            }

            if (l2 != null) {
                l2Val = l2.val;
            }


            merged.val = Math.min(l1Val, l2Val);

            if (merged.val == l1Val && l1 != null) {
                l1 = l1.next;
            } else if (merged.val == l2Val && l2 != null) {
                l2 = l2.next;
            }


            if (l1 == null && l2 == null)
                break;
            else {
                merged.next = new ListNode(0);
                merged = merged.next;
            }
        }

        return mergedPointerNode;
    }
}
