// Last updated: 10/12/2026, 5:06:08 PM
1class Solution {
2    public int maxSum(List<Integer> nums, int k) {
3        final long MOD = 1_000_000_007;
4        int[] cnt = new int[30];  // coins in each bit column, never changes
5        for (int x : nums)
6            for (int b = 0; b < 30; b++) cnt[b] += x >> b & 1;
7        long total = 0;
8        for (int i = 0; i < k; i++) {  // build row i of the stacked picture
9            long row = 0;
10            for (int b = 0; b < 30; b++)
11                if (cnt[b] > i) row |= 1L << b;  // a coin from every column with more than i coins
12            total = (total + row * row) % MOD;
13        }
14        return (int) total;
15    }
16}