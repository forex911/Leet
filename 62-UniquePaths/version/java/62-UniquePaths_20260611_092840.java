// Last updated: 6/11/2026, 9:28:40 AM
1class Solution {
2    public int uniquePathsWithObstacles(int[][] ob) {
3        int m=ob.length;
4        int n=ob[0].length;
5        int[][] dp=new int[m][n];
6        if(ob[0][0]==1) return 0;
7        dp[0][0]=1;
8        for(int i=0;i<m;i++){
9            for(int j=0;j<n;j++){
10                if(ob[i][j]==1) dp[i][j]=0;
11                else{
12                    if(i>0) dp[i][j]+=dp[i-1][j];
13                    if(j>0) dp[i][j]+=dp[i][j-1];
14                }
15            }
16        }
17        return dp[m-1][n-1];
18    }
19}