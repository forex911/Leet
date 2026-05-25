// Last updated: 5/25/2026, 11:12:39 AM
class Solution {
    public int uniquePathsWithObstacles(int[][] ob) {
        int m=ob.length;
        int n=ob[0].length;
        int[][] dp=new int[m][n];
        if(ob[0][0]==1) return 0;
        dp[0][0]=1;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(ob[i][j]==1) dp[i][j]=0;
                else{
                    if(i>0) dp[i][j]+=dp[i-1][j];
                    if(j>0) dp[i][j]+=dp[i][j-1];
                }
            }
        }
        return dp[m-1][n-1];
    }
}