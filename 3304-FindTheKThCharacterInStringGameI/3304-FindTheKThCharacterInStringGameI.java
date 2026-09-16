// Last updated: 9/16/2026, 2:00:27 PM
class Solution {
    public char kthCharacter(int k) {
        return (char)('a'+Integer.bitCount(k-1));
    }
}