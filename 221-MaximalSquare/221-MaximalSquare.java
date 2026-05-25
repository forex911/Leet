// Last updated: 5/25/2026, 11:10:52 AM
class Solution {
    public int maximalSquare(char[][] m) {
        int row=m.length;
        int col=m[0].length;
        int max=0;
        int dp[][]=new int[row][col];
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                if(m[i][j]=='1'){
                    if(i==0 || j==0){
                            dp[i][j]=1;
                    }
                    else{
                        dp[i][j]=Math.min(Math.min(dp[i][j-1],dp[i-1][j]),dp[i-1][j-1])+1;
                    }
                    max=Math.max(max,dp[i][j]);
                }
            }
        }
        return max*max;
    }
}