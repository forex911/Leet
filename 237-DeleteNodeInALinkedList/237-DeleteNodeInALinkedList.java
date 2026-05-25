// Last updated: 5/25/2026, 11:10:43 AM
class Solution {
    public void deleteNode(ListNode node) {
        if(node==null || node.next==null) return;
        node.val=node.next.val;
        node.next=node.next.next;
    }
}