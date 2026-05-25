// Last updated: 5/25/2026, 11:10:53 AM
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> window=new HashSet<>();
        int left=0;
        for(int right=0;right<nums.length;right++){
            if(window.contains(nums[right])){
                return true;
            }
            window.add(nums[right]);
            if(right-left>=k){
                window.remove(nums[left]);
                left++;
            }
        }
        return false;
    }
}