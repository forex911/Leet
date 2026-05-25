// Last updated: 5/25/2026, 11:12:12 AM
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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null) return null;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode pre=dummy;
        for(int i=1;i<left;i++){
            pre=pre.next;
        }
        ListNode cur=pre.next;
        ListNode prev=null;
        ListNode tail=cur;
        for(int i=left;i<=right;i++){
            ListNode next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        pre.next=prev;
        tail.next=cur;
        return dummy.next;
    }
}

