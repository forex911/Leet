// Last updated: 5/27/2026, 5:21:13 AM
1class Solution {
2    public int minSubArrayLen(int target, int[] nums) {
3        int left=0;
4        int min=Integer.MAX_VALUE;
5        int sum=0;
6        for(int right=0;right<nums.length;right++){
7            sum+=nums[right];
8            while(sum>=target){
9                min=Math.min(min,right-left+1);
10                sum-=nums[left];
11                left++;
12            }
13           
14        }
15        if(min==Integer.MAX_VALUE) return 0;
16        return min;
17    }
18}