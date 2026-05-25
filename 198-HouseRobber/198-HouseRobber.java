// Last updated: 5/25/2026, 11:11:10 AM
class Solution {
    public int rob(int[] nums) {
        int result=0;
        if(nums.length==0){
            return 0;
        }
        if(nums.length==1){
            return nums[0];
        }
        int i=nums[0];
        int j=Math.max(nums[0],nums[1]);
        for(int rob=2;rob<nums.length;rob++){
              result=Math.max(nums[rob]+i,j);
              i=j;
              j=result;
        }
        return j;
    }
}