// Last updated: 5/25/2026, 11:09:07 AM
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