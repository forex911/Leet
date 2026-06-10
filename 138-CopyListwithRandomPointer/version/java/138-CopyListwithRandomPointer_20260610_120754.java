// Last updated: 6/10/2026, 12:07:54 PM
1/*
2// Definition for a Node.
3class Node {
4    int val;
5    Node next;
6    Node random;
7
8    public Node(int val) {
9        this.val = val;
10        this.next = null;
11        this.random = null;
12    }
13}
14*/
15
16class Solution {
17    public Node copyRandomList(Node head) {
18        HashMap<Node,Node> map=new HashMap<>();
19        Node tem=head;
20        while(tem!=null){
21            map.put(tem,new Node(tem.val));
22            tem=tem.next;
23        }
24        tem=head;
25        while(tem!=null){
26            Node c=map.get(tem);
27            c.next=map.get(tem.next);
28            c.random=map.get(tem.random);
29            tem=tem.next;
30        }
31        return map.get(head);
32    }
33}