// Last updated: 8/14/2026, 10:47:34 AM
class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        int minn=n;
        int minm=m;
        for(int[] x:ops){
            minn=Math.min(minn,x[1]);
            minm=Math.min(minm,x[0]);
        }
        return minn*minm;
    }
}