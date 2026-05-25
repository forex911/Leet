// Last updated: 5/25/2026, 11:12:42 AM
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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || k==0){
            return head;
        }
        int len=1;
        ListNode tail=head;
        while(tail.next!=null){
            tail=tail.next;
            len++;
        }
        tail.next=head;
        k%=len;
        if(k==0){
            tail.next=null;
            return head;
        }
        ListNode res=head;
        for(int i=0;i<len-k-1;i++){
            res=res.next;
        }
        ListNode result=res.next;
        res.next=null;
        return result;
    }
}