// Last updated: 6/15/2026, 2:55:27 PM
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
12    public ListNode deleteDuplicates(ListNode head) {
13        if(head==null) return head;
14        ListNode dummy=new ListNode(0);
15        dummy.next=head;
16        ListNode pre=dummy;
17        ListNode cur=head;
18        while(cur!=null){
19            if(cur.next!=null && cur.next.val==cur.val){
20                while(cur.next!=null && cur.next.val==cur.val){
21                    cur=cur.next;
22                }
23                pre.next=cur.next;
24            }
25            else{
26                pre=pre.next;
27            }
28            cur=cur.next;
29        }
30        return dummy.next;
31    }
32}