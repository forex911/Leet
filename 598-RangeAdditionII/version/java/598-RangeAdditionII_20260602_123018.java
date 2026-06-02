// Last updated: 6/2/2026, 12:30:18 PM
1class Solution {
2    public int maxCount(int m, int n, int[][] ops) {
3        int minn=n;
4        int minm=m;
5        for(int[] x:ops){
6            minn=Math.min(minn,x[1]);
7            minm=Math.min(minm,x[0]);
8        }
9        return minn*minm;
10    }
11}