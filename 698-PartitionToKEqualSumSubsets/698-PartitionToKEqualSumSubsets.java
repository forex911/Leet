// Last updated: 5/25/2026, 11:09:18 AM
class Solution {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int sum = 0;
        for (int n : nums) sum += n;
        if (sum % k != 0) return false;

        int target = sum / k;
        Arrays.sort(nums);

        return dfs(nums, nums.length - 1, new int[k], target);
    }

    private boolean dfs(int[] nums, int index, int[] bucket, int target) {
        if (index < 0) return true;

        for (int i = 0; i < bucket.length; i++) {
            if (bucket[i] + nums[index] > target) continue;

            bucket[i] += nums[index];

            if (dfs(nums, index - 1, bucket, target))
                return true;

            bucket[i] -= nums[index];

            if (bucket[i] == 0) break;
        }
        return false;
    }
}