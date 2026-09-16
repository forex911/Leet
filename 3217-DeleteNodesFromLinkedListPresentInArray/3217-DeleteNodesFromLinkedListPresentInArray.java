// Last updated: 9/16/2026, 2:00:34 PM
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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode cur=dummy;
        if(set.contains(cur.val)) head=head.next;
        while(cur.next!=null){
            if(set.contains(cur.next.val)) cur.next=cur.next.next;
            else cur=cur.next;
        }
        return dummy.next;
    }
}