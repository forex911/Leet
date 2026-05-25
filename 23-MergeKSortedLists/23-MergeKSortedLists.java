// Last updated: 5/25/2026, 11:13:21 AM
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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode dummy=new ListNode(0);
        ListNode tem=dummy;
        for(ListNode head:lists){
            while(head!=null){
                tem.next=new ListNode(head.val);
                tem=tem.next;
                head=head.next;
            }
        }
        dummy.next=sortlist(dummy.next);
        return dummy.next;
    }
    public ListNode sortlist(ListNode head){
        ListNode dum=head;
        ArrayList<Integer> tem=new ArrayList<>();
        while(dum!=null){
            tem.add(dum.val);
            dum=dum.next;
        }
        Collections.sort(tem);
        dum=head;
        for(int i=0;i<tem.size();i++){
            dum.val=tem.get(i);
            dum=dum.next;
        }
        return head;
    }
}