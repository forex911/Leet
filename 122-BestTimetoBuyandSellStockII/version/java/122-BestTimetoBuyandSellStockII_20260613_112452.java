// Last updated: 6/13/2026, 11:24:52 AM
1class Solution {
2    public int maxProfit(int[] prices) {
3        int max = 0;
4        
5        for(int i = 1;i < prices.length;i++){
6            if(prices[i] > prices[i - 1]){
7                max += (prices[i] - prices[i -1]);
8            }
9        }
10        return max;
11    }
12}