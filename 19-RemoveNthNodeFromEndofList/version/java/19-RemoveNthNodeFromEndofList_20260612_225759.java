// Last updated: 6/12/2026, 10:57:59 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode removeNthFromEnd(ListNode head, int n) {
13        ListNode dummy=new ListNode(0);
14        dummy.next=head;
15        ListNode fast=dummy,slow=dummy;
16        for(int i=0;i<n;i++){
17            fast=fast.next;
18        }
19        while(fast.next!=null){
20            fast=fast.next;
21            slow=slow.next;
22        }
23        slow.next=slow.next.next;
24        return dummy.next;
25    }
26}