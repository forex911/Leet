// Last updated: 7/14/2026, 10:41:44 PM
1class Solution {
2    public long sumAndMultiply(int n) {
3        String tem = Integer.toString(n);
4        StringBuilder adder = new StringBuilder();
5        long sum = 0;
6
7        for (char x : tem.toCharArray()) {
8            int digit = x - '0';
9
10            if (digit != 0) {
11                adder.append(x);
12                sum += digit;
13            }
14        }
15
16        if (adder.length() == 0) {
17            return 0;
18        }
19
20        long concatenatedValue = Long.parseLong(adder.toString());
21
22        return concatenatedValue * sum;
23    }
24}