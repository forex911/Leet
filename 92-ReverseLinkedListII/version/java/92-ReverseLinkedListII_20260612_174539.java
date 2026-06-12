// Last updated: 6/12/2026, 5:45:39 PM
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
12    public ListNode reverseBetween(ListNode head, int left, int right) {
13        if(head==null) return null;
14        ListNode dummy=new ListNode(0);
15        dummy.next=head;
16        ListNode pre=dummy;
17        for(int i=1;i<left;i++){
18            pre=pre.next;
19        }
20        ListNode cur=pre.next;
21        ListNode prev=null;
22        ListNode tail=cur;
23        for(int i=left;i<=right;i++){
24            ListNode next=cur.next;
25            cur.next=prev;
26            prev=cur;
27            cur=next;
28        }
29        pre.next=prev;
30        tail.next=cur;
31        return dummy.next;
32    }
33}
34
35