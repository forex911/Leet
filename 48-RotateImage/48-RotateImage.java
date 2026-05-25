// Last updated: 5/25/2026, 11:12:56 AM
class Solution {
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix[0].length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int i=0;i<matrix.length;i++){
            int c=0;
            for(int j=matrix[0].length-1;j>0;j--){
                if(c<j){
                int temp=matrix[i][c];
                matrix[i][c]=matrix[i][j];
                matrix[i][j]=temp;
                }
                c++;
            }
        }
    }
}