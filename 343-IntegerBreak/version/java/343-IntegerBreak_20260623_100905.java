// Last updated: 6/23/2026, 10:09:05 AM
1class Solution {
2    public int integerBreak(int n) {
3        if (n == 2) return 1;
4        if (n == 3) return 2;
5
6        int product = 1;
7
8        while (n > 4) {
9            product *= 3;
10            n -= 3;
11        }
12
13        return product * n;
14    }
15}