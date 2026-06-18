// Last updated: 6/18/2026, 10:57:29 AM
1class Solution {
2    public char processStr(String s, long k) {
3        long len = 0;
4
5        for (char c : s.toCharArray()) {
6            if (c == '*') len = Math.max(0, len - 1);
7            else if (c == '#') len *= 2;
8            else if (c != '%') len++;
9        }
10
11        if (k >= len) return '.';
12
13        for (int i = s.length() - 1; i >= 0; i--) {
14            char c = s.charAt(i);
15
16            if (c == '*') len++;
17
18            else if (c == '#') {
19                long half = len / 2;
20                if (k >= half) k -= half;
21                len = half;
22            }
23
24            else if (c == '%') {
25                k = len - 1 - k;
26            }
27
28            else {
29                if (k == len - 1) return c;
30                len--;
31            }
32        }
33
34        return '.';
35    }
36}