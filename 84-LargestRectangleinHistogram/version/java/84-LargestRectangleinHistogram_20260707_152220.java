// Last updated: 7/7/2026, 3:22:20 PM
1class Solution {
2    public int maxProfit(int[] prices) {
3        int min=Integer.MAX_VALUE;
4        int ans=0;
5        for(int i=0;i<prices.length;i++){
6            if(min>prices[i]){
7                min=prices[i];
8            }
9            ans=Math.max(ans,prices[i]-min);
10        }
11        return ans;
12    }
13}