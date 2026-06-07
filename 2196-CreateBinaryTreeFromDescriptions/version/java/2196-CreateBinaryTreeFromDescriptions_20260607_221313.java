// Last updated: 6/7/2026, 10:13:13 PM
1class Solution {
2    public TreeNode createBinaryTree(int[][] A) {
3        Map<Integer, TreeNode> nodes = new HashMap<>(A.length + 1, 1);
4        int root = 0;
5
6        for (int[] d : A) {
7            int x = d[0], y = d[1];
8            if (!nodes.containsKey(x)) {
9                nodes.put(x, new TreeNode(x));
10                root ^= x;
11            }
12            if (!nodes.containsKey(y)) {
13                nodes.put(y, new TreeNode(y));
14                root ^= y;
15            }
16            if (d[2] == 1) {
17                nodes.get(x).left = nodes.get(y);
18            } else {
19                nodes.get(x).right = nodes.get(y);
20            }
21            root ^= y;
22        }
23
24        return nodes.get(root);
25    }
26}