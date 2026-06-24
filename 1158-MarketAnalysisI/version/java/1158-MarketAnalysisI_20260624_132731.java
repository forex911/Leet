// Last updated: 6/24/2026, 1:27:31 PM
1class Solution {
2    int MOD = 1000000007;
3    Integer[][] dp;
4    public int numRollsToTarget(int n, int k, int target) {
5        dp = new Integer[n + 1][target + 1];
6        return solve(n, k, target);
7    }
8    private int solve(int dice, int faces, int target) {
9        if (dice == 0) {
10            return target == 0 ? 1 : 0;
11        }
12        if (target < 0) {
13            return 0;
14        }
15        if (dp[dice][target] != null) {
16            return dp[dice][target];
17        }
18        long ways = 0;
19        for (int face = 1; face <= faces; face++) {
20            ways += solve(dice - 1, faces, target - face);
21            ways %= MOD;
22        }
23        return dp[dice][target] = (int) ways;
24    }
25}