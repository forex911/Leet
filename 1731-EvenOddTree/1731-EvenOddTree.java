// Last updated: 5/25/2026, 11:07:59 AM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isEvenOddTree(TreeNode root) {
        if(root==null) return true;
        Queue<TreeNode> q=new LinkedList<>();
        int level=1;
        int che=0;
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            if(level%2==0) che=Integer.MAX_VALUE;
            else che=Integer.MIN_VALUE;
            while(q.peek()!=null){
                if(level%2!=q.peek().val%2) return false;
                if(level%2==0 && che<=q.peek().val) return false;
                if(level%2!=0 && che>=q.peek().val) return false;
                if(q.peek().left!=null) q.add(q.peek().left);
                if(q.peek().right!=null) q.add(q.peek().right);
                che=q.poll().val;
            }
            q.poll();
            if(q.isEmpty()) break;
            level++;
            q.add(null);
        }
        return true;
    }
}