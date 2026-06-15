// Last updated: 6/15/2026, 3:58:45 PM
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
12    public ListNode rotateRight(ListNode head, int k) {
13        if(head==null || k==0){
14            return head;
15        }
16        int len=1;
17        ListNode tail=head;
18        while(tail.next!=null){
19            tail=tail.next;
20            len++;
21        }
22        tail.next=head;
23        k%=len;
24        if(k==0){
25            tail.next=null;
26            return head;
27        }
28        ListNode res=head;
29        for(int i=0;i<len-k-1;i++){
30            res=res.next;
31        }
32        ListNode result=res.next;
33        res.next=null;
34        return result;
35    }
36}