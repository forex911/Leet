// Last updated: 7/30/2026, 2:32:44 PM
1class Solution {
2    public int minimumPushes(String word) {
3        int n = word.length();
4        int blocks = n / 8;
5        return (blocks * (blocks + 1) * 4)
6                + (n % 8) * (blocks + 1);
7    }
8}