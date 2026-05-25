// Last updated: 5/25/2026, 11:12:22 AM
class Solution {
    public boolean search(int[] nums, int target) {
        int st=0;
        int end=nums.length-1;
        while(st<=end){
            int mid=(st+end)/2;

            if(nums[mid]==target){
                return true;
            }
            if(nums[st]==nums[mid] && nums[end]==nums[mid]){
                st++;
                end--;
            }
            else if(nums[mid]>=nums[st]){
                if(nums[st]<=target && nums[mid]>target){
                    end=mid-1;
                }
                else{
                    st=mid+1;
                }
            }
            else{
                if(nums[end]>=target && nums[mid]<target){
                    st=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        }
        return false;
    }
}