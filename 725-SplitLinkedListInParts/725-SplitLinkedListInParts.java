// Last updated: 5/25/2026, 11:09:15 AM
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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] res=new ListNode[k];
        if(head==null || k==1){
            res[0]=head;
            return res;
        }
        
        int len=0;
        ListNode tem=head;
        while(tem!=null){
            len++;
            tem=tem.next;
        }
        if(len<=k){
            for(int i=0;i<len;i++){
                res[i]=new ListNode(head.val);
                head=head.next;
            }
            return res;}
        int min=len/k;
        int ex=len%k;
        int ind=0;
        ListNode curr=head;
         for (int i = 0; i < k; i++) {
            if (curr == null) {
                res[i] = null;
                continue;
            }

            res[i] = curr;
            int partSize = min + (ex > 0 ? 1 : 0);
            ex--;

            for (int j = 1; j < partSize; j++) {
                curr = curr.next;
            }

            ListNode next = curr.next;
            curr.next = null; 
            curr = next;
        }
        System.out.print(len+""+min+""+ex);
        return res;
    }
}