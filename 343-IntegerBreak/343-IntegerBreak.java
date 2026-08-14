// Last updated: 8/14/2026, 10:49:03 AM
class Solution {
    public int integerBreak(int n) {
        if (n == 2) return 1;
        if (n == 3) return 2;

        int product = 1;

        while (n > 4) {
            product *= 3;
            n -= 3;
        }

        return product * n;
    }
}