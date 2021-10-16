/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 * 206. Reverse Linked List
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 */
class Solution {
  public ListNode reverseList(ListNode head) {
    ListNode prev = null;
    ListNode curr = head;
    while(curr != null) {
      ListNode nextTmp = curr.next;
      curr.next = prev;
      prev = curr;
      curr = nextTmp;
    }
    return prev;
  }
}