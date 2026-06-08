// Last updated: 6/8/2026, 8:15:36 PM
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
12    public ListNode mergeKLists(ListNode[] lists) {
13        ListNode dummy=new ListNode(0);
14        ListNode tem=dummy;
15        for(ListNode head:lists){
16            while(head!=null){
17                tem.next=new ListNode(head.val);
18                tem=tem.next;
19                head=head.next;
20            }
21        }
22        dummy.next=sortlist(dummy.next);
23        return dummy.next;
24    }
25    public ListNode sortlist(ListNode head){
26        ListNode dum=head;
27        ArrayList<Integer> tem=new ArrayList<>();
28        while(dum!=null){
29            tem.add(dum.val);
30            dum=dum.next;
31        }
32        Collections.sort(tem);
33        dum=head;
34        for(int i=0;i<tem.size();i++){
35            dum.val=tem.get(i);
36            dum=dum.next;
37        }
38        return head;
39    }
40}