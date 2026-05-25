// Last updated: 5/25/2026, 11:09:54 AM
class Solution {
    public int pathSum(TreeNode root, int targetSum) {
        // it is best ques to know that how we count target for each node
        if (root == null) return 0;

        int count = findSum(root, 0, targetSum);

        count += pathSum(root.left, targetSum);
        count += pathSum(root.right, targetSum);

        return count;
    }

    public int findSum(TreeNode root, long cSum, int target) {
        if (root == null){
            return 0;
        } 
        cSum += root.val;
        int count = 0;

        if (cSum == target) {
            count++;
        }
        count += findSum(root.left, cSum, target);
        count += findSum(root.right, cSum, target);

        return count;
    }
}