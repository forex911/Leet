// Last updated: 5/25/2026, 11:10:49 AM
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
 
// class Solution 
// {
//     public TreeNode invertTree(TreeNode root) 
//     {
//         if (root == null) return null;
//         TreeNode temp = root.left;
//         root.left = invertTree(root.right);
//         root.right = invertTree(temp);
//         return root;
//     }
// }













class Solution 
{
    public TreeNode invertTree(TreeNode root) 
    {
        return operation(root);
    }
    public TreeNode operation(TreeNode root)
    {
        if(root == null) return null;

        TreeNode left = operation(root.left);
        TreeNode right = operation(root.right);

        if(root.left != null || root.right != null)
        {
            root.left = right;
            root.right = left;
        }

        return root;
    } 
}