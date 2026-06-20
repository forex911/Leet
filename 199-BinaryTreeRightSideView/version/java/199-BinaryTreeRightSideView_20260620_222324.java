// Last updated: 6/20/2026, 10:23:24 PM
1class Solution {
2    List<Integer> result = new ArrayList<>();
3
4    public List<Integer> rightSideView(TreeNode root) {
5        dfs(root, 0);
6        return result;
7    }
8
9    private void dfs(TreeNode node, int level) {
10        if (node == null) return;
11
12        if (level == result.size()) {
13            result.add(node.val);
14        }
15
16        dfs(node.right, level + 1);
17        dfs(node.left, level + 1);
18    }
19}
20