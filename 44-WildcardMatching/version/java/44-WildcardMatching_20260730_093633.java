// Last updated: 7/30/2026, 9:36:33 AM
1class Solution {
2    public boolean isMatch(String s, String p) {
3        int m=s.length();
4        int n=p.length();
5        boolean [][] dp=new boolean[m+1][n+1];
6        dp[0][0]=true;
7        for(int i=1;i<=n;i++){
8            if(p.charAt(i-1)=='*'){
9                dp[0][i]=dp[0][i-1];
10            }
11        }
12        for(int i=1;i<=m;i++){
13            for(int j=1;j<=n;j++){
14                if(p.charAt(j-1)=='*'){
15                    dp[i][j]=dp[i][j-1] || dp[i-1][j];
16                }
17                else if(p.charAt(j-1)=='?' || p.charAt(j-1)==s.charAt(i-1)){
18                    dp[i][j]=dp[i-1][j-1];
19                }
20            }
21        }
22        return dp[m][n];
23    }
24}