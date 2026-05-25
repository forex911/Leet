// Last updated: 5/25/2026, 11:11:33 AM
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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) {
            return head;
        }
        ListNode mid=findmid(head);
        ListNode rh=mid.next;
        mid.next=null;
        ListNode left=sortList(head);
        ListNode right=sortList(rh);
        return merge(left,right);
    }
    public ListNode findmid(ListNode head){
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode merge(ListNode right,ListNode left){
        ListNode result=new ListNode(-2);
        ListNode tem=result;
        while(right!=null && left!=null){
            if(right.val<=left.val){
                tem.next=right;
                right=right.next;
            }
            else{
                tem.next=left;
                left=left.next;
            }
            tem=tem.next;
        }
        while(right!=null){
            tem.next=right;
            right=right.next;
            tem=tem.next;
        }
        while(left!=null){
            tem.next=left;
            left=left.next;
            tem=tem.next;
        }
        return result.next;
    }
}