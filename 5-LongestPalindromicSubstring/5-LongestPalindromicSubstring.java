// Last updated: 5/25/2026, 11:13:41 AM
public class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        if (n <= 1) return s;
        boolean[][] dp = new boolean[n][n];
        int start = 0;
        int maxLen = 1;
        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
        }
        for (int len = 2; len <= n; len++) {
            for (int i = 0; i + len - 1 < n; i++) {
                int j = i + len - 1;

                if (s.charAt(i) == s.charAt(j)) {
                    if (len <= 2) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }

                    if (dp[i][j] && len > maxLen) {
                        start = i;
                        maxLen = len;
                    }
                }
            }
        }

        return s.substring(start, start + maxLen);
    }
}
