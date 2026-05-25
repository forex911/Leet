// Last updated: 5/25/2026, 11:12:21 AM
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;

        ListNode dummy = new ListNode();
        dummy.next = head;

        ListNode prev = dummy;   
        ListNode curr = head;   
        while (curr != null) {
            if (curr.next != null && curr.val == curr.next.val) {
                while (curr.next != null && curr.val == curr.next.val) {
                    curr = curr.next;
                }

                prev.next = curr.next;

            } else {
               
                prev = prev.next;
            }

            curr = curr.next;
        }

        return dummy.next;
    }
}
