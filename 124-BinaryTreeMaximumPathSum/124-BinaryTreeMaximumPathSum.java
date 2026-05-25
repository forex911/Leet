// Last updated: 5/25/2026, 11:11:49 AM
class Solution {
    int ans = Integer.MIN_VALUE;
    
    public int maxPathSum(TreeNode root) {
        helper(root);
        return ans;
    }

    int helper(TreeNode node) {
        if (node == null) return 0;

      
        int left = Math.max(helper(node.left), 0);
        int right = Math.max(helper(node.right), 0);

       
        int pathSum = node.val + left + right;
        
       
        ans = Math.max(ans, pathSum);

       
        return node.val + Math.max(left, right);
    }
}