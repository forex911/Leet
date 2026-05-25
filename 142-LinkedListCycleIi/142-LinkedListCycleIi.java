// Last updated: 5/25/2026, 11:11:38 AM
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        // if(head==null || head.next==null){
        //     return null;
        // }
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                break;
            }
        }
        if(fast == null || fast.next == null){
            return null;
        }
        ListNode pre1=slow;
        ListNode pre2=head;
        while(pre1!=pre2){
            pre1=pre1.next;
            pre2=pre2.next;
        }
        return pre1;
    }
}