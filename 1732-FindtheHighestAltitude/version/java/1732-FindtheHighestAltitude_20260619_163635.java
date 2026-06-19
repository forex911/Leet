// Last updated: 6/19/2026, 4:36:35 PM
1class Solution {
2    public int largestAltitude(int[] gain) {
3        int ans=0;
4        int cur=0;
5        for(int x:gain){
6            cur+=x;
7            ans=Math.max(ans,cur);
8        }
9        return ans;
10    }
11}