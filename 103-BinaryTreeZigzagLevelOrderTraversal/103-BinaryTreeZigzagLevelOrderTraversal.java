// Last updated: 5/25/2026, 11:12:01 AM
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root == null) return new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();
        q.add(root);
        boolean rev = false;
        while(!q.isEmpty()){
            int size = q.size();
            Integer[] sub = new Integer[size];
            for(int i=0 ;i<size ;i++){
                TreeNode node = q.remove();
                int index = rev ? size-i-1 : i;
                sub[index] = node.val;
                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);
            }
            result.add(Arrays.asList(sub));
            rev = !rev;
        }
        return result;
    }
}