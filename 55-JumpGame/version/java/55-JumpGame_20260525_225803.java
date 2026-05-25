// Last updated: 5/25/2026, 10:58:03 PM
1class Solution {
2    public boolean canJump(int[] nums) {
3
4        int max = 0;
5
6        for(int i = 0; i < nums.length; i++) {
7
8            if(i > max) return false;
9
10            max = Math.max(max, i + nums[i]);
11        }
12
13        return true;
14    }
15}