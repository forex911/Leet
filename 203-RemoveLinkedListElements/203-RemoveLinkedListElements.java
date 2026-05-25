// Last updated: 5/25/2026, 11:11:05 AM
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
    public ListNode removeElements(ListNode head, int val) {
        ListNode result=new ListNode(0),cur=result;
        result.next=head;
        while(cur.next!=null){
            if(cur.next.val==val) cur.next=cur.next.next;
            else cur=cur.next;
        }
        return result.next;
    }
}