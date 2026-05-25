// Last updated: 5/25/2026, 11:11:55 AM
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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null) return false;
        if(root.right==null && root.left==null){
            return targetSum==root.val;
        }
        boolean right=hasPathSum(root.right, targetSum-root.val);
        boolean left=hasPathSum(root.left, targetSum-root.val);
        return left || right;
    }
}