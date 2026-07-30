// Last updated: 7/30/2026, 1:47:22 PM
1class Solution {
2    public boolean checkValidString(String s) {
3        int cmin = 0, cmax = 0; 
4        for (char c : s.toCharArray()) {
5            if (c == '(') {
6                cmax++;
7                cmin++;
8            } else if (c == ')') {
9                cmax--;
10                cmin--;
11            } else if (c == '*') {
12                cmax++; 
13                cmin--; 
14            }
15            if (cmax < 0) return false; 
16            cmin = Math.max(cmin, 0);   
17        }
18        return cmin == 0; 
19    }
20}