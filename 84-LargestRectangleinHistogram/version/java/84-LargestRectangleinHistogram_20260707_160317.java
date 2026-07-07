// Last updated: 7/7/2026, 4:03:17 PM
1class Solution {
2    public int maxSubArray(int[] nums) {
3        int cur=0;
4        int ans=Integer.MIN_VALUE;
5        for(int i=0;i<nums.length;i++){
6            cur+=nums[i];
7            ans=Math.max(ans,cur);
8            if(cur<0){
9                cur=0;
10            }
11        }
12        return ans;
13    }
14}