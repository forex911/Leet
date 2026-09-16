// Last updated: 9/16/2026, 2:07:16 PM
class Solution {
    public int search(int[] nums, int target) {
        int low=0;
        int max=nums.length-1;
        while(low<=max){
            int mid=(max+low)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                max=mid-1;
            }
            else if(nums[mid]<target){
                  low=mid+1;
            }
        }
        return -1;
    }
}