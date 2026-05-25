// Last updated: 5/25/2026, 11:10:23 AM
class Solution {
    public int maxCoins(int[] nums) {
        
        int[] arr=new int[nums.length+2];
        int[][] dp=new int[arr.length][arr.length];

        arr[0]=1;
        arr[nums.length+1]=1;
        for(int i=1;i<=nums.length;i++){
            arr[i]=nums[i-1];
        }
        return func(arr,0,arr.length-1,dp);

    }
    public static int func(int[] arr,int i,int j,int[][] dp){
        if(i+1==j){ // no more ele between i and j
            return 0;
        }
        if(dp[i][j]!=0){
            return dp[i][j];
        }
        int Max_coins=0;

        for(int k=i+1;k<j;k++){
            int left=func(arr,i,k,dp);
            int right=func(arr,k,j,dp);
            int self=arr[i]*arr[k]*arr[j];
            Max_coins=Math.max(Max_coins,left+right+self);

        }
        return dp[i][j]=Max_coins;
    }
    
}