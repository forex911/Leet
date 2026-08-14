// Last updated: 8/14/2026, 10:41:38 AM
class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        for(int i=1;i<c;i++){
            sort(grid,0,i,true);
        }
         for(int i=0;i<r;i++){
            sort(grid,i,0,false);
        }
        return grid;
    }
    private void sort(int[][] mat,int row,int col,boolean check){
        int r=row;
        int c=col;
        List<Integer> tem=new ArrayList<>();
        while(r<mat.length && c<mat[0].length){
            tem.add(mat[r][c]);
            r++;
            c++;
        }
        int ind=0;
        r=row;
        c=col;
        if(check==true){
            Collections.sort(tem);
        }
        else{
            Collections.sort(tem,Collections.reverseOrder());
        }
        
        while(r<mat.length && c<mat[0].length){
            mat[r][c]=tem.get(ind);
            r++;
            c++;
            ind++;
        }
    }
}