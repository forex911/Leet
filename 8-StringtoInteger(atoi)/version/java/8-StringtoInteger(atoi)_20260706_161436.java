// Last updated: 7/6/2026, 4:14:36 PM
1class Solution {
2    public int myAtoi(String s) {
3        s = s.trim();
4        int sign = 1, i = 0;
5        long res = 0; 
6
7        if (s.length() == 0) return 0;
8
9
10        if (s.charAt(0) == '-') { sign = -1; i++; }
11        else if (s.charAt(0) == '+') { i++; }
12
13      
14        while (i < s.length()) {
15            char ch = s.charAt(i);
16            if (ch < '0' || ch > '9') break; 
17
18            res = res * 10 + (ch - '0'); 
19            if (sign * res > Integer.MAX_VALUE) return Integer.MAX_VALUE; 
20            if (sign * res < Integer.MIN_VALUE) return Integer.MIN_VALUE;
21
22            i++;
23        }
24        return (int) (sign * res);
25    }
26}