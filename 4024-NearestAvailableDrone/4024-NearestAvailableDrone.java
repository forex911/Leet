// Last updated: 8/22/2026, 10:07:28 AM
1class Solution {
2    public int minPenalty(int period, int[] lights, int[] arrivalTime) {
3        int ans=0;
4        int maxi=Integer.MIN_VALUE;
5        for(int j:lights){
6            maxi=Math.max(maxi,j);
7        }
8        for(int i=0;i<arrivalTime.length;i++){
9            int x=arrivalTime[i]%period;
10            if(x<maxi) continue;
11            ans=Math.max(ans,period-x);
12        }
13        System.out.println(maxi);
14        return ans;
15    }
16}