// Last updated: 5/25/2026, 11:07:42 AM
class Solution {
    public boolean rep(String s, int i) {
        // substring is s[i], s[i+1], s[i+2]
        return s.charAt(i) != s.charAt(i+1) &&
               s.charAt(i+1) != s.charAt(i+2) &&
               s.charAt(i) != s.charAt(i+2);
    }

    public int countGoodSubstrings(String s) {
        if (s.length() < 3) return 0;

        int res = 0;

        for (int i = 0; i <= s.length() - 3; i++) {
            if (rep(s, i)) res++;
        }

        return res;
    }
}
