// Last updated: 9/16/2026, 2:02:12 PM
class Solution {
    public int[] buildArray(int[] nums) {
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[nums[i]];
        }
        return ans;
    }
}