// Last updated: 6/15/2026, 4:15:27 PM
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
12    public ListNode partition(ListNode head, int x) {
13        ListNode smalldummy=new ListNode(0);
14        ListNode largedummy=new ListNode(0);
15        ListNode large=largedummy;
16        ListNode small=smalldummy;
17        while(head!=null){
18            if(head.val<x){
19                small.next=head;
20                small=small.next;
21            }
22            else{
23                large.next=head;
24                large=large.next;
25            }
26            head=head.next;
27        }
28        large.next=null;
29        small.next=largedummy.next;
30        return smalldummy.next;
31    }
32}