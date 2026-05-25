// Last updated: 5/25/2026, 11:08:23 AM
class Solution {
    public int lastStoneWeightII(int[] stones) {
        int sum=0;
        for(int i:stones) sum+=i;
        int target=sum/2;
        boolean dp[] = new boolean[target+1];
        dp[0]=true;
        for(int num:stones){
            for(int i=target;i>=num;i--){
                dp[i]=dp[i] || dp[i-num];
            }
        }
        for(int i=target;i>=0;i--){
            if(dp[i]){
                return sum-2*i;
            }
        }
        return 0;
    }
}