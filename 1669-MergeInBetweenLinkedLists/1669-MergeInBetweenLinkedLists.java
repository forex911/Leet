// Last updated: 9/16/2026, 2:03:12 PM
class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode curr1 = list1;
        ListNode prev1 = null;
        int count = 0;
        while(curr1 != null){
            if(count == a) break;
            count++;
            prev1 = curr1;
            curr1 = curr1.next;
        }

        ListNode curr2 = curr1;
        ListNode prev2 = null;
        int count2 = a-1;
        while(curr2 != null){
            if(count2 == b) break;
            count2++;
            prev2 = curr2;
            curr2 = curr2.next;
        }

        ListNode l2curr = list2;
        ListNode l2prev = null;
        while(l2curr != null){
            l2prev = l2curr;
            l2curr = l2curr.next;
        }
        prev1.next = list2;
        l2prev.next = curr2;

        return list1;
    }
}