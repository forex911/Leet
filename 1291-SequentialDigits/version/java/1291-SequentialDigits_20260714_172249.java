// Last updated: 7/14/2026, 5:22:49 PM
1class Solution {
2    public boolean isMatch(String s, String p) {
3
4    if (s == null || p == null) {
5        return false;
6    }
7    boolean[][] dp = new boolean[s.length()+1][p.length()+1];
8    dp[0][0] = true;
9    for (int i = 0; i < p.length(); i++) {
10        if (p.charAt(i) == '*' && dp[0][i-1]) {
11            dp[0][i+1] = true;
12        }
13    }
14    for (int i = 0 ; i < s.length(); i++) {
15        for (int j = 0; j < p.length(); j++) {
16            if (p.charAt(j) == '.') {
17                dp[i+1][j+1] = dp[i][j];
18            }
19            if (p.charAt(j) == s.charAt(i)) {
20                dp[i+1][j+1] = dp[i][j];
21            }
22            if (p.charAt(j) == '*') {
23                if (p.charAt(j-1) != s.charAt(i) && p.charAt(j-1) != '.') {
24                    dp[i+1][j+1] = dp[i+1][j-1];
25                } else {
26                    dp[i+1][j+1] = (dp[i+1][j] || dp[i][j+1] || dp[i+1][j-1]);
27                }
28            }
29        }
30    }
31    return dp[s.length()][p.length()];
32}
33}