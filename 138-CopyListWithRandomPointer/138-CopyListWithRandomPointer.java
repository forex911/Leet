// Last updated: 8/14/2026, 10:51:22 AM
/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node,Node> map=new HashMap<>();
        Node tem=head;
        while(tem!=null){
            map.put(tem,new Node(tem.val));
            tem=tem.next;
        }
        tem=head;
        while(tem!=null){
            Node c=map.get(tem);
            c.next=map.get(tem.next);
            c.random=map.get(tem.random);
            tem=tem.next;
        }
        return map.get(head);
    }
}