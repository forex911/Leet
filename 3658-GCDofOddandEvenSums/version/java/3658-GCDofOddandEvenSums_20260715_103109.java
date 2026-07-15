// Last updated: 7/15/2026, 10:31:09 AM
1class Solution {
2
3    public int gcdOfOddEvenSums(int n) {
4        int sumOdd = n * n;
5        int sumEven = n * (n + 1);
6
7        while(sumEven != 0) {
8            int temp = sumEven;
9            sumEven = sumOdd % sumEven;
10            sumOdd = temp;
11        }
12
13        return Math.abs(sumOdd);
14    }
15}