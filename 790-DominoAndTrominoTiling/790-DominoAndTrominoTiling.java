// Last updated: 9/16/2026, 2:06:56 PM
class Solution {
    public int numTilings(int n) {
        int mod = 1000000007;

        long[] dp = new long[n + 1];
        long[] gap = new long[n + 1];

        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = (dp[i-1] + dp[i-2] + 2 * gap[i-1]) % mod;
            gap[i] = (gap[i-1] + dp[i-2]) % mod;
        }

        return (int) dp[n];
    }
}