// Last updated: 9/16/2026, 2:01:30 PM
class Solution {
    public boolean isStrictlyPalindromic(int n) {
        return n>>1==1<<n;
    }
}