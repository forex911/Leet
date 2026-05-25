// Last updated: 5/25/2026, 9:56:35 PM
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
12    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
13        ListNode res=new ListNode(0);
14        ListNode cur=res;
15        while(list1!=null && list2!=null){
16            if(list1.val<list2.val){
17                cur.next=list1;
18                list1=list1.next;
19            }
20            else{
21                cur.next=list2;
22                list2=list2.next;
23            }
24            cur=cur.next;
25        }
26        if(list1!=null){
27            cur.next=list1;
28        }
29        else{
30            cur.next=list2;
31        }
32        return res.next;
33    }
34}