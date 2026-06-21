// Last updated: 6/21/2026, 9:40:29 AM
1class Solution {
2    public int maxIceCream(int[] costs, int coins) {
3        Arrays.sort(costs);
4        int n=0;
5        int ans=0;
6        for(int x:costs){
7            n+=x;
8            if(n>coins){
9                n-=x;
10            }
11            else{
12                ans++;
13            }
14        }
15        return ans;
16    }
17}