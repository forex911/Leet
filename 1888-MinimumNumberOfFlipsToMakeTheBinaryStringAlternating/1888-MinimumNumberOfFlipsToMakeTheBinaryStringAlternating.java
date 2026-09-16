// Last updated: 9/16/2026, 2:02:17 PM
class Solution {
    public static int minFlips(String s) {
        final int n = s.length();
        int p = 0, k = 0;
        for (int i = 0; i < n; i++) {
            final char c = s.charAt(i);
            k += p ^ c & 1;
            p ^= 1;
        }
        int r = Math.min(k, n - k);
        if ((n & 1) != 0) {
            p = 0;
            for (int i = 0; i + 1 < n; i++) {
                final char c = s.charAt(i);
                k += (p ^ c & 1 ^ 1) - (p ^ c & 1);
                p ^= 1;
                r = Math.min(r, Math.min(k, n - k));
            }
        }
        return r;
    }
}