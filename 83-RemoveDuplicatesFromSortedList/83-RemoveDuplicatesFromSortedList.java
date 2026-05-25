// Last updated: 5/25/2026, 11:12:19 AM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;  // Pointer to traverse the list

        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                // Remove duplicate by skipping the next node
                current.next = current.next.next;
            } else {
                // Move to the next unique node
                current = current.next;
            }
        }
        return head; // Return modified list
    }
}