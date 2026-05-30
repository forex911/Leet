// Last updated: 5/30/2026, 8:45:44 AM
1public class Solution {
2    public int maxCount(int m, int n, int[][] ops) {
3        int minX = m;
4        int minY = n;
5
6        for (int[] v : ops) {
7            minX = Math.min(minX, v[0]);
8            minY = Math.min(minY, v[1]);
9        }
10
11        return minX * minY;
12    }
13}