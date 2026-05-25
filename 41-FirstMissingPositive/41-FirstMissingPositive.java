// Last updated: 5/25/2026, 11:13:01 AM
class Solution {
    public int firstMissingPositive(int[] nums) {
        boolean [] arr = new boolean [nums.length+1];
        for(int i = 0; i<nums.length; i++){
            if(nums[i] >= 0 && nums[i] < arr.length)
                arr[nums[i]] = true;
        }
        for(int i = 1; i<arr.length;i++){
            if(arr[i] == false)
                return i;
        }
        return arr.length;
}
}