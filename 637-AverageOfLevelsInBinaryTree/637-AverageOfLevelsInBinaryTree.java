// Last updated: 5/25/2026, 11:09:24 AM
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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
    int levelSize = q.size(); 
    double levelSum = 0;
    for (int i = 0; i < levelSize; i++) {
        TreeNode node = q.poll(); 
        levelSum += node.val;
        if (node.left != null) q.add(node.left);
        if (node.right != null) q.add(node.right);
    }
    ans.add(levelSum / levelSize);
}
        return ans;
    }
}