// Last updated: 6/3/2026, 10:10:37 AM
1class Solution {
2    public int[][] sortMatrix(int[][] grid) {
3        int r=grid.length;
4        int c=grid[0].length;
5        for(int i=1;i<c;i++){
6            sort(grid,0,i,true);
7        }
8         for(int i=0;i<r;i++){
9            sort(grid,i,0,false);
10        }
11        return grid;
12    }
13    private void sort(int[][] mat,int row,int col,boolean check){
14        int r=row;
15        int c=col;
16        List<Integer> tem=new ArrayList<>();
17        while(r<mat.length && c<mat[0].length){
18            tem.add(mat[r][c]);
19            r++;
20            c++;
21        }
22        int ind=0;
23        r=row;
24        c=col;
25        if(check==true){
26            Collections.sort(tem);
27        }
28        else{
29            Collections.sort(tem,Collections.reverseOrder());
30        }
31        
32        while(r<mat.length && c<mat[0].length){
33            mat[r][c]=tem.get(ind);
34            r++;
35            c++;
36            ind++;
37        }
38    }
39}