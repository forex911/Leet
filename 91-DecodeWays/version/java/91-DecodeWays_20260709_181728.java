// Last updated: 7/9/2026, 6:17:28 PM
1class Solution {
2    	public int numDecodings(String s) {
3        int n=s.length();
4        int[] dp=new int[n+1];
5        dp[n]=1;
6        for(int i=n-1;i>=0;i--)
7            if(s.charAt(i)!='0') {
8                dp[i]=dp[i+1];
9                if(i<n-1&&(s.charAt(i)=='1'||s.charAt(i)=='2'&&s.charAt(i+1)<'7')) 
10					dp[i]+=dp[i+2];
11            }
12        return dp[0];   
13    }
14}