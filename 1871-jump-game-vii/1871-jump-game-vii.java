class Solution {
    public boolean canReach(String s, int minJump, int maxJump) {
        
        boolean[] dp=new boolean[s.length()];
        int reached=0;
        dp[0]=true;
        for(int i=1;i<s.length();i++){
            if(i-minJump>=0 && dp[i-minJump]){
                reached++;
            }
            if(i-maxJump-1>=0 && dp[i-maxJump-1]){
                reached--;
            }
            if(reached>0 && s.charAt(i)=='0'){
                dp[i]=true;
            }
        }
        return dp[s.length()-1];
    }
}