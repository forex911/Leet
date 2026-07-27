// Last updated: 7/27/2026, 11:15:39 AM
1class Solution {
2    public int maxProduct(int[] nums) {
3        for(int i=0;i<nums.length;i++){
4            nums[i]=nums[i]-1;
5        }
6        Arrays.sort(nums);
7        return nums[nums.length-1]*nums[nums.length-2];
8    }
9}