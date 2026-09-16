// Last updated: 9/16/2026, 2:02:56 PM
class Solution {
    public int largestAltitude(int[] gain) {
        int ans=0;
        int cur=0;
        for(int x:gain){
            cur+=x;
            ans=Math.max(ans,cur);
        }
        return ans;
    }
}