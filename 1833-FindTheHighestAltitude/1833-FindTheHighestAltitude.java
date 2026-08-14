// Last updated: 8/14/2026, 10:43:53 AM
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