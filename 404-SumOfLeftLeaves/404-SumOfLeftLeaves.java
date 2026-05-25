// Last updated: 5/25/2026, 11:10:03 AM
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
    static int s=0;
    static void dfs(TreeNode root,boolean l){
        if (root==null) return ;
        if (root.left==null && root.right==null && l==true) s=s+root.val;
        dfs(root.left,true);
        dfs(root.right,false);
    }
    public int sumOfLeftLeaves(TreeNode root) {
        s=0;
        dfs(root,false);
        return s;
    }
}