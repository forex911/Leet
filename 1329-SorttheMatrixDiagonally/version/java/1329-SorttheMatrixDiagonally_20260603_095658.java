// Last updated: 6/3/2026, 9:56:58 AM
1class Solution {
2    public int[][] diagonalSort(int[][] mat) {
3        int row=mat.length;
4        int col=mat[0].length;
5        for(int i=0;i<col;i++){
6            sort(mat,0,i);
7        }
8        for(int i=1;i<row;i++){
9            sort(mat,i,0);
10        }
11        return mat;
12    }
13    private void sort(int[][] mat,int row,int col){
14        int r=row;
15        int c=col;
16        List<Integer> tem=new ArrayList<>();
17        while(r<mat.length && c<mat[0].length){
18            tem.add(mat[r][c]);
19            r++;
20            c++;
21        }
22        Collections.sort(tem);
23        int index=0;
24        r=row;
25        c=col;
26        while(r<mat.length && c<mat[0].length){
27            mat[r][c]=tem.get(index);
28            r++;
29            c++;
30            index++;
31        }
32    }
33}