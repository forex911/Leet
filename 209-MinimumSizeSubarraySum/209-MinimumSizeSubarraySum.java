// Last updated: 5/25/2026, 11:10:59 AM
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int min=Integer.MAX_VALUE;
        int sum=0;
        for(int right=0;right<nums.length;right++){
            sum+=nums[right];
            while(sum>=target){
                min=Math.min(min,right-left+1);
                sum-=nums[left];
                left++;
            }
           
        }
        if(min==Integer.MAX_VALUE) return 0;
        return min;
    }
}