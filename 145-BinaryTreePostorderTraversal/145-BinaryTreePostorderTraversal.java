// Last updated: 5/25/2026, 11:11:34 AM
class Solution {

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        postorderHelper(root, ans);
        return ans;
    }

    public void postorderHelper( TreeNode root,List<Integer> ans){
        if (root == null) return;
        postorderHelper(root.left, ans);
        postorderHelper(root.right, ans);
        ans.add(root.val);
    }
}