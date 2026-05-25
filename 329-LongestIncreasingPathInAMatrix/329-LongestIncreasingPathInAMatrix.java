// Last updated: 5/25/2026, 11:10:16 AM
class Solution {
    int n,m;
    int[][] dp,matrix;

    public int dfs(int i,int j){
        if(dp[i][j]!=-1) return dp[i][j];
        // // Directions: up, down, left, right
        int[] drow = {-1,0,1,0};
        int[] dcol = {0,1,0,-1};

        // At least the cell itself
        int val = 1;

        for(int k = 0;k<4;k++){
            int nrow = drow[k]+ i;
            int ncol = dcol[k]+ j;

            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && 
            matrix[nrow][ncol] > matrix[i][j]){
                val = Math.max(val,1+dfs(nrow,ncol));
            }
        }

        dp[i][j] = val;
        return val;
    }
    public int longestIncreasingPath(int[][] matrix) {
        n = matrix.length;
        m = matrix[0].length;

        this.matrix = matrix;

        dp = new int[n][m];

        for(int[] row:dp)
        Arrays.fill(row,-1);

        int ans = 0;

        // Try starting DFS from every cell
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                ans = Math.max(ans,dfs(i,j));
            }
        }

        return ans;
    }
}