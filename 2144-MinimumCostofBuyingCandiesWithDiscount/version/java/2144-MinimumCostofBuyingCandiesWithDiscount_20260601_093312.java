// Last updated: 6/1/2026, 9:33:12 AM
1class Solution {
2    public int minimumCost(int[] cost) {
3        Arrays.sort(cost);
4        int total = 0;
5        for (int i = cost.length - 1; i >= 0; i -= 3) {
6            total += cost[i];
7            if (i - 1 >= 0)
8                total += cost[i - 1];
9        }
10        return total;
11    }
12}