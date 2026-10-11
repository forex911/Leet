// Last updated: 10/11/2026, 8:28:10 AM
1class Solution {
2    public int sumOfSquares(int[] nums) {
3        int sum=0;
4        int n=nums.length;
5        for(int i=0;i<n;i++){
6            if(n%(i+1)==0){
7                sum+=(nums[i]*nums[i]);
8            }
9        }
10        return sum;
11    }
12}