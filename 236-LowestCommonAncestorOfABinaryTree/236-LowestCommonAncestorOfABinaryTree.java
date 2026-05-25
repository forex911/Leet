// Last updated: 5/25/2026, 11:10:45 AM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null || root==p || root==q) return root;
        TreeNode right=lowestCommonAncestor(root.right,p,q);
        TreeNode left=lowestCommonAncestor(root.left,p,q);
        if(right!=null && left!=null) return root;
        return left!=null?left:right;
    }
}