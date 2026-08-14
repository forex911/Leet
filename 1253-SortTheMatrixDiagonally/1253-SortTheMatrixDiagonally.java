// Last updated: 8/14/2026, 10:45:05 AM
class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int row=mat.length;
        int col=mat[0].length;
        for(int i=0;i<col;i++){
            sort(mat,0,i);
        }
        for(int i=1;i<row;i++){
            sort(mat,i,0);
        }
        return mat;
    }
    private void sort(int[][] mat,int row,int col){
        int r=row;
        int c=col;
        List<Integer> tem=new ArrayList<>();
        while(r<mat.length && c<mat[0].length){
            tem.add(mat[r][c]);
            r++;
            c++;
        }
        Collections.sort(tem);
        int index=0;
        r=row;
        c=col;
        while(r<mat.length && c<mat[0].length){
            mat[r][c]=tem.get(index);
            r++;
            c++;
            index++;
        }
    }
}