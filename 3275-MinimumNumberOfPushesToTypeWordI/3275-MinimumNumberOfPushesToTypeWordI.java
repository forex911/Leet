// Last updated: 8/14/2026, 10:41:59 AM
class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        int blocks = n / 8;
        return (blocks * (blocks + 1) * 4)
                + (n % 8) * (blocks + 1);
    }
}