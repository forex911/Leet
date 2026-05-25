// Last updated: 5/25/2026, 11:13:06 AM
class Solution {
    public int searchInsert(int[] nums, int target) {
        int result=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                result=i;
                break;
            }
            else if(nums[i]<target){
                result=i+1;
            }     
            
        }
        return result;
    }
}