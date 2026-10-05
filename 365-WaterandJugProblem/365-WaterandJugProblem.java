// Last updated: 10/5/2026, 12:22:07 PM
1class Solution {
2    public boolean canMeasureWater(int x, int y, int target) {
3        if(x+y<target) return false;
4        if(x==0) return y==target;
5        if(y==0) return x==target;
6        while(x!=0){
7            int tem=x;
8            x=y%x;
9            y=tem;
10        }
11        return target%y==0;
12    }
13}