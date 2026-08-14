// Last updated: 8/14/2026, 10:44:33 AM
class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> ans=new ArrayList<>();
        int n=matrix.length;
        int m=matrix[0].length;
        List<Integer> rowmin=new ArrayList<>();
         List<Integer> colmax=new ArrayList<>();
        int ind=0;
        for(int i=0;i<n;i++){
            int min=Integer.MAX_VALUE;
            for(int j=0;j<m;j++){
                min=Math.min(min,matrix[i][j]);
            }
            rowmin.add(min);
        }
        for(int i=0;i<m;i++){
            int min=Integer.MIN_VALUE;
            for(int j=0;j<n;j++){
                min=Math.max(min,matrix[j][i]);
            }
            colmax.add(min);
        }
        for(int x:colmax){
            if(rowmin.contains(x)){
                ans.add(x);
            }
        }
        return ans;
    }
}