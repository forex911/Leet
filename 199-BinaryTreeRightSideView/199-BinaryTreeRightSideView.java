// Last updated: 5/25/2026, 11:11:09 AM
class Solution {
    List<Integer> result = new ArrayList<>();

    public List<Integer> rightSideView(TreeNode root) {
        dfs(root, 0);
        return result;
    }

    private void dfs(TreeNode node, int level) {
        if (node == null) return;

        if (level == result.size()) {
            result.add(node.val);
        }

        dfs(node.right, level + 1);
        dfs(node.left, level + 1);
    }
}
