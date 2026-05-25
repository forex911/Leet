// Last updated: 5/25/2026, 11:13:22 AM
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>[] dp=new ArrayList[n+1];
        for(int i=0;i<=n;i++){
            dp[i]=new ArrayList<>();
        }
        dp[0].add("");
        for(int i=1;i<=n;i++){
            for(int k=0;k<i;k++){
                for(String left:dp[k]){
                    for(String right:dp[i-k-1]){
                        dp[i].add("("+left+")"+right);
                    }
                }
            }
        }
        return dp[n];
    }
}