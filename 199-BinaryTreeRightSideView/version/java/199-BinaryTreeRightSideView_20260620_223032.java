// Last updated: 6/20/2026, 10:30:32 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public List<Double> averageOfLevels(TreeNode root) {
18        List<Double> ans=new ArrayList<>();
19        if(root==null){
20            return ans;
21        }
22        Queue<TreeNode> q=new LinkedList<>();
23        q.add(root);
24        while (!q.isEmpty()) {
25    int levelSize = q.size(); 
26    double levelSum = 0;
27    for (int i = 0; i < levelSize; i++) {
28        TreeNode node = q.poll(); 
29        levelSum += node.val;
30        if (node.left != null) q.add(node.left);
31        if (node.right != null) q.add(node.right);
32    }
33    ans.add(levelSum / levelSize);
34}
35        return ans;
36    }
37}