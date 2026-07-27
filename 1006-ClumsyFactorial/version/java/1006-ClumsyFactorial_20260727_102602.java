// Last updated: 7/27/2026, 10:26:02 AM
1class Solution {
2    public int clumsy(int N) {
3        if (N == 1) return 1;
4        if (N == 2) return 2;
5        if (N == 3) return 6;
6        if (N == 4) return 7;
7
8        if (N % 4 == 0) return N + 1;
9        if (N % 4 <= 2) return N + 2;
10        return N - 1;
11    }
12}