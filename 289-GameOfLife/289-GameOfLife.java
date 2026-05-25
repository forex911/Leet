// Last updated: 5/25/2026, 11:10:30 AM
class Solution {
    public void gameOfLife(int[][] board) {
        int n=board.length;
        int m=board[0].length;
        int[] dirRow ={-1, -1, -1, 0, +1, +1, +1, 0};
        int[] dirCol ={-1, 0, +1, +1, +1, 0, -1, -1};
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int nei=0;
                for(int k=0;k<8;k++){
                    int nx=i+dirRow[k];
                    int ny=j+dirCol[k];

                    if(nx>=0 && nx<=n-1 && ny>=0 && ny<=m-1 && Math.abs(board[nx][ny]) == 1){
                        nei++;
                    }
                }
                if(board[i][j]==1 && (nei<2 || nei>3)){
                    board[i][j]=-1;
                }
                if(board[i][j]==0 && nei==3){
                    board[i][j]=2;
                }

            }
        }
        for(int i=0;i<n;i++){
           for( int j=0;j<m;j++){
                if(board[i][j]==-1) board[i][j]=0;
                if(board[i][j]==2) board[i][j]=1;
            }
        }
    }
}