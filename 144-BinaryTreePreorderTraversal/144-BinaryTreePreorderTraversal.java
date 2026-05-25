// Last updated: 5/25/2026, 11:11:36 AM
class Solution {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        preorderHelper(root, ans);
        return ans;
    }

    public void preorderHelper( TreeNode root,List<Integer> ans){
        if (root == null) return;
        ans.add(root.val);
        preorderHelper(root.left, ans);
        preorderHelper(root.right, ans);
    }
}