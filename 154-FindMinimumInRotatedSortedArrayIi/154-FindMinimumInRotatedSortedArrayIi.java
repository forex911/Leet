// Last updated: 5/25/2026, 11:11:29 AM
class Solution {
    public int findMin(int[] nums) {
        int st=0;
        int end=nums.length-1;
        while(st<end){
            int mid=(st+end)/2;
            if(nums[mid]>nums[end]){
                st=mid+1;
            }
            else if(nums[mid]<nums[end]){
                end=mid;
            }
            else{
                end--;
            }
        }
        return nums[end];
    }
}