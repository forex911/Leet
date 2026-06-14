// Last updated: 6/14/2026, 7:10:24 PM
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
17    public List<List<Integer>> levelOrder(TreeNode root) {
18        List<List<Integer>> ans=new ArrayList<>();
19        if(root==null) return ans;
20        Queue<TreeNode> l=new ArrayDeque<>();
21        l.add(root);
22        while(!l.isEmpty()){
23            List<Integer> s=new ArrayList<>();
24            int n=l.size();
25            for(int i=0;i<n;i++){
26                TreeNode x=l.poll();
27                s.add(x.val);
28                if(x.left!=null){
29                    l.add(x.left);
30                }
31                if(x.right!=null){
32                    l.add(x.right);
33                }
34            }
35            ans.add(s);
36        }
37        return ans;
38    }
39}