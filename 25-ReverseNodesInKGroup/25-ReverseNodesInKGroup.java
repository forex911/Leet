// Last updated: 5/25/2026, 11:13:19 AM
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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode res=head;
        for(int i=0;i<k;i++){
            if(res==null){
                return head;
            }
            res=res.next;
        }
        ListNode cur=head,pre=null;
        int c=0;
        while(c<k){
            ListNode next=cur.next;
            cur.next=pre;
            pre=cur;
            cur=next;
            c++;
        }
        head.next=reverseKGroup(cur,k);
        return pre;
    }
}