/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
 public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

  if (headA == null || headB == null) return null;

  ListNode a = headA;
  ListNode b = headB;

  int aLen, bLen;
  aLen = bLen = 0;
  while (a != null) {
   a = a.next;
   aLen++;
  }

  while (b != null) {
   b = b.next;
   bLen++;
  }

  a = headA;
  b = headB;

  int difference = Math.max(aLen, bLen) - Math.min(aLen, bLen);

  if (aLen > bLen)
   while (difference--> 0)
    a = a.next;

  else if (bLen > aLen)
   while (difference--> 0)
    b = b.next;

  ListNode common = null;
  ListNode commonHead = null;

  while (a != null && b != null) {

   if (a.val == b.val) {

    if (common == null) {
     common = new ListNode(a.val);
     commonHead = common;
    } else {
     common.next = new ListNode(a.val);
     common = common.next;
    }

   } else common = null;

   a = a.next;
   b = b.next;

  }


  return commonHead;
 }
}
