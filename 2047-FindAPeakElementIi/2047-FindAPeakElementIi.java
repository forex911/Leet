// Last updated: 8/14/2026, 10:43:20 AM
class Solution {
    public int[] findPeakGrid(int[][] arr) {
        int m=arr.length;
        int n=arr[0].length;
        int[] ans=new int[2];
        for(int i=0;i<m;i++){
		    for(int j=0;j<n;j++){
		        int x=arr[i][j];
		        if((i==0||x>arr[i-1][j])&&(i==m-1||x>arr[i+1][j])&&(j==0||x>arr[i][j-1])&&(j==n-1||x>arr[i][j+1])){
                    ans[0]=i;
                    ans[1]=j;
		            return ans;
		        }
		    }
		}
        return ans;
    }
}