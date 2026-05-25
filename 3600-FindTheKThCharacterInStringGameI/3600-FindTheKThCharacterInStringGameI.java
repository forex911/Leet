// Last updated: 5/25/2026, 11:06:58 AM
class Solution {
    public char kthCharacter(int k) {
        return (char)('a'+Integer.bitCount(k-1));
    }
}