// Last updated: 6/18/2026, 11:25:06 AM
1class Solution {
2    public List<Integer> luckyNumbers(int[][] matrix) {
3        List<Integer> ans=new ArrayList<>();
4        int n=matrix.length;
5        int m=matrix[0].length;
6        List<Integer> rowmin=new ArrayList<>();
7         List<Integer> colmax=new ArrayList<>();
8        int ind=0;
9        for(int i=0;i<n;i++){
10            int min=Integer.MAX_VALUE;
11            for(int j=0;j<m;j++){
12                min=Math.min(min,matrix[i][j]);
13            }
14            rowmin.add(min);
15        }
16        for(int i=0;i<m;i++){
17            int min=Integer.MIN_VALUE;
18            for(int j=0;j<n;j++){
19                min=Math.max(min,matrix[j][i]);
20            }
21            colmax.add(min);
22        }
23        for(int x:colmax){
24            if(rowmin.contains(x)){
25                ans.add(x);
26            }
27        }
28        return ans;
29    }
30}