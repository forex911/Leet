// Last updated: 5/25/2026, 12:28:46 PM
1class Solution {
2
3    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
4
5        ListNode result = new ListNode(0);
6
7        ListNode dummy = result;
8
9        int carry = 0;
10
11        while (l1 != null || l2 != null || carry != 0) {
12
13            int n = (l1 != null) ? l1.val : 0;
14            int m = (l2 != null) ? l2.val : 0;
15
16            int sum = n + m + carry;
17
18            carry = sum / 10;
19
20            int digit = sum % 10;
21
22            dummy.next = new ListNode(digit);
23
24            dummy = dummy.next;
25
26            if (l1 != null) {
27                l1 = l1.next;
28            }
29
30            if (l2 != null) {
31                l2 = l2.next;
32            }
33        }
34
35        return result.next;
36    }
37}