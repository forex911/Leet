// Last updated: 5/25/2026, 11:09:36 AM
class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int prefix_sum = 0;

        for (int i = 0; i < n; i++) {
            prefix_sum += nums[i];
            int remainder = prefix_sum % k;
            if (map.containsKey(remainder)) {
                if (i - map.get(remainder) >= 2) {
                    return true;
                }
            } else {
                map.put(remainder, i);
            }

        }

        return false;
    }
}