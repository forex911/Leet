// Last updated: 5/25/2026, 11:09:31 AM
class Solution {
    public int subarraySum(int[] nums, int k) {

        Map<Integer, Integer> mp = new HashMap<>();
        
        mp.put(0, 1);

        int count = 0;
        int currSum = 0;

        for(int i = 0; i < nums.length; i++) {
            currSum += nums[i];

            if(mp.containsKey(currSum - k)) {
                count += mp.get(currSum - k);
            } 

            mp.put(currSum, mp.getOrDefault(currSum, 0) + 1);
        }

        return count;
    }
}