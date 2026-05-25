// Last updated: 5/25/2026, 11:09:35 AM
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
    private int max=0;
    public int helper(TreeNode node){
        if(node==null) return 0;
        int right=helper(node.right);
        int left=helper(node.left);
        max=Math.max(max,right+left);
        return 1+Math.max(right,left);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        max=0;
        helper(root);
        return max;
    }
}