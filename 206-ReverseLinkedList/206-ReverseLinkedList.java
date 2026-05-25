// Last updated: 5/25/2026, 11:11:00 AM
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
    public ListNode reverseList(ListNode head) {
        ListNode pre=null,curr=head;
        while(curr!=null){
            ListNode tem=curr.next;
            curr.next=pre;
            pre=curr;
            curr=tem;
        }
        return pre;
    }
}