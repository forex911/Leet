// Last updated: 9/16/2026, 2:03:24 PM
class Solution {
    public int numSpecial(int[][] mat) {
        int result=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==0) continue;
                else {
                    if(check(mat,i,j)){
                        result++;
                    }
                }
            }
        }
        return result;
    }
    public boolean check(int[][] mat,int row,int col){
        int r1=0;
        int c1=0;
        for(int i=0;i<mat.length;i++){
            
            if(mat[i][col]==1) c1++;
        }
        for(int i=0;i<mat[0].length;i++){
            
            if(mat[row][i]==1) r1++;
        }
        
        if(r1>1 || c1>1) return false;
        return true;
    }
}